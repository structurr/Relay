package ImageTools;

import java.awt.image.BufferedImage;

/**
 * The <code>ImageTools</code> class provides methods for easier
 * manipulation of a {@link java.awt.image.BufferedImage}. All
 * methods found in this class can be created manually and
 * implemented in a program; the main purpose of the class is to
 * provide commonly used image manipulation methods not provided
 * by {@link java.awt.image.BufferedImage}.
 *
 * Most methods in this class require at least one {@link java.awt.image.BufferedImage}
 * as a parameter to be edited. Other methods may require two
 * {@link java.awt.image.BufferedImage} objects based on the
 * the task the function is carrying out.
 *
 * @see java.awt.image.BufferedImage
 */

public class SizeTools {

    /**
     * Default constructor
     */
    public SizeTools() { }

    public static BufferedImage scale(BufferedImage imageToScale, double factor) {
        return resize(imageToScale, (int) Math.ceil(imageToScale.getWidth() * factor), (int) Math.ceil(imageToScale.getHeight() * factor));
    }

    /**
     *
     *
     * @param imageToResize
     * @param newWidth
     * @param newHeight
     *
     * @return
     */
    public static BufferedImage resize(BufferedImage imageToResize, int newWidth, int newHeight) {
        double widthFactor = (double) newWidth / (double) imageToResize.getWidth();
        double heightFactor = (double) newHeight / (double) imageToResize.getHeight();

        BufferedImage newImage = new BufferedImage(newWidth, newHeight, imageToResize.getType());

        for (int x = 0; x < newWidth; x++) {
            for (int y = 0; y < newHeight; y++) {
                newImage.setRGB(x, y, imageToResize.getRGB((int) (x / widthFactor), (int) (y / heightFactor)));
            }
        }

        return newImage;
    }

}
