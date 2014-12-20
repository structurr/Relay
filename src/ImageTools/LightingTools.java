package ImageTools;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by sam on 12/7/14.
 */
public class LightingTools {

    /**
     * Default constructor
     */
    public LightingTools () { }

    /**
     *
     *
     * @param imageToDarken
     * @param intensity
     *
     * @return
     */
    public static BufferedImage darken(BufferedImage imageToDarken, int intensity) {
        return darken(imageToDarken, intensity, 0, 0, imageToDarken.getWidth(), imageToDarken.getHeight());
    }

    /**
     *
     *
     * @param imageToDarken
     * @param intensity
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage darken(BufferedImage imageToDarken, int intensity, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToDarken);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                Color rgbValue = new Color(imageToDarken.getRGB(x, y));

                newImage.setRGB(x, y,
                        new Color(GeneralUtilities.colorRangeTrap(rgbValue.getRed() - intensity),
                                GeneralUtilities.colorRangeTrap(rgbValue.getGreen() - intensity),
                                GeneralUtilities.colorRangeTrap(rgbValue.getBlue() - intensity)).getRGB());
            }
        }

        return newImage;
    }

    /**
     *
     *
     * @param imageToBrighten
     * @param intensity
     *
     * @return
     */
    public static BufferedImage brighten(BufferedImage imageToBrighten, int intensity) {
        return brighten(imageToBrighten, intensity, 0, 0, imageToBrighten.getWidth(), imageToBrighten.getHeight());
    }

    /**
     *
     *
     * @param imageToBrighten
     * @param intensity
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage brighten(BufferedImage imageToBrighten, int intensity, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToBrighten);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                Color rgbValue = new Color(imageToBrighten.getRGB(x, y));

                newImage.setRGB(x, y,
                        new Color(GeneralUtilities.colorRangeTrap(rgbValue.getRed() + intensity),
                                GeneralUtilities.colorRangeTrap(rgbValue.getGreen() + intensity),
                                GeneralUtilities.colorRangeTrap(rgbValue.getBlue() + intensity)).getRGB());
            }
        }

        return newImage;
    }

}
