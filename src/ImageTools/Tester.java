package ImageTools;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by sam on 12/8/14.
 */
public class Tester {

    public static void main(String args[]) throws IOException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home") + "/prg/idea-wkspc/"));

        BufferedImage image1 = null;
        BufferedImage image2 = null;

        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            image1 = (ImageIO.read(fileChooser.getSelectedFile()));
        }

        image2 = ColorTools.applyRGBFilter(image1, 30, 0, 50);
        image2 = LightingTools.darken(image2, 100);
        image2 = SelectionTools.paste(image2, SelectionTools.copy(image1, 100, 100, 300, 300), 50, 50);
//        image2 = SizeTools.scale(image2, 0.5);

        JFrame jFrame = new JFrame();
        jFrame.add(new JLabel(new ImageIcon(image2)));
        jFrame.pack();
        jFrame.setVisible(true);
    }

}
