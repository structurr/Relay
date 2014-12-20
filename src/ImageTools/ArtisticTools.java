package ImageTools;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by sam on 12/7/14.
 */
public class ArtisticTools {

    /**
     * Default constructor
     */
    public ArtisticTools() { }

    /**
     *
     *
     * @param imageToConvertToBlackAndWhite
     * @param threshold
     *
     * @return
     */
    public static BufferedImage convertToBlackAndWhite(BufferedImage imageToConvertToBlackAndWhite, int threshold) {
        return convertToBlackAndWhite(imageToConvertToBlackAndWhite, threshold, 0, 0, imageToConvertToBlackAndWhite.getWidth(), imageToConvertToBlackAndWhite.getHeight());
    }

    /**
     *
     *
     * @param imageToConvertToBlackAndWhite
     * @param threshold
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage convertToBlackAndWhite(BufferedImage imageToConvertToBlackAndWhite, int threshold, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToConvertToBlackAndWhite);

        for (int x = startX; x < width ; x++) {
            for (int y = startY; y < height; y++) {
                if ((ColorTools.getPixelRed(imageToConvertToBlackAndWhite, x, y) + ColorTools.getPixelGreen(imageToConvertToBlackAndWhite, x, y) + ColorTools.getPixelBlue(imageToConvertToBlackAndWhite, x, y) / 3) < threshold) {
                    newImage.setRGB(x, y, new Color(0, 0, 0).getRGB());
                } else {
                    newImage.setRGB(x, y, new Color(255, 255, 255).getRGB());
                }
            }
        }

        return newImage;
    }

    /**
     *
     *
     * @param imageToConvertToGrayscale
     *
     * @return
     */
    public static BufferedImage convertToGrayscale(BufferedImage imageToConvertToGrayscale) {
        return convertToGrayscale(imageToConvertToGrayscale, 0, 0, imageToConvertToGrayscale.getWidth(), imageToConvertToGrayscale.getHeight());
    }

    /**
     *
     *
     * @param imageToConvertToGrayscale
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage convertToGrayscale(BufferedImage imageToConvertToGrayscale, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToConvertToGrayscale);
        int averageRGBValue;

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                averageRGBValue = (ColorTools.getPixelRed(imageToConvertToGrayscale, x, y) + ColorTools.getPixelGreen(imageToConvertToGrayscale, x, y) + ColorTools.getPixelBlue(imageToConvertToGrayscale, x, y)) / 3;
                newImage.setRGB(x, y, new Color(averageRGBValue, averageRGBValue, averageRGBValue).getRGB());
            }
        }

        return newImage;
    }

    /**
     *
     *
     * @param imageToConvertToSepia
     *
     * @return
     */
    public static BufferedImage convertToSepia(BufferedImage imageToConvertToSepia) {
        return convertToSepia(imageToConvertToSepia, 0, 0, imageToConvertToSepia.getWidth(), imageToConvertToSepia.getHeight());
    }

    /**
     *
     *
     * @param imageToConvertToSepia
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage convertToSepia(BufferedImage imageToConvertToSepia, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToConvertToSepia);

        int oldRed;
        int oldGreen;
        int oldBlue;

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                oldRed = ColorTools.getPixelRed(imageToConvertToSepia, x, y);
                oldGreen = ColorTools.getPixelGreen(imageToConvertToSepia, x, y);
                oldBlue = ColorTools.getPixelBlue(imageToConvertToSepia, x, y);

                newImage.setRGB(x, y,
                        new Color(Math.min((int) ((oldRed * .393) + (oldGreen * .769) + (oldBlue * .189)), 255),
                        Math.min((int) ((oldRed * .349) + (oldGreen * .686) + (oldBlue * .168)), 255),
                        Math.min((int) ((oldRed * .272) + (oldGreen * .534) + (oldBlue * .131)), 255)).getRGB());
            }
        }

        return newImage;
    }

    public static BufferedImage posterize(BufferedImage imageToPosterize, int threshold, Color darkColor, Color lightColor) {
        return posterize(imageToPosterize, threshold, darkColor, lightColor, 0, 0, imageToPosterize.getWidth(), imageToPosterize.getHeight());
    }

    public static BufferedImage posterize(BufferedImage imageToPosterize, int threshold, Color darkColor, Color lightColor, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToPosterize);

        return newImage;
    }

    /**
     *
     *
     * @param imageToNegate
     *
     * @return
     */
    public static BufferedImage negate(BufferedImage imageToNegate) {
        return negate(imageToNegate, 0, 0, imageToNegate.getWidth(), imageToNegate.getHeight());
    }

    /**
     *
     *
     * @param imageToNegate
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage negate(BufferedImage imageToNegate, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToNegate);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                Color colorOriginalImage = new Color(imageToNegate.getRGB(x, y));

                newImage.setRGB(x, y, new Color(255 - colorOriginalImage.getRed(), 255 - colorOriginalImage.getGreen(), 255 - colorOriginalImage.getBlue()).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToMarkEdgesOf</code>
     * with detected edges above sensitivity threshold marked in black
     * over a white background.
     *
     * @param imageToMarkEdgesOf Image to detect and edges from
     * @param sensitivity 1-100 value to represent edge sensitivity
     *
     * @return copy of <code>BufferedImage imageToMarkEdgesOf</code>
     * with detected edges above sensitivity marked in black over a
     * white background
     */
    public static BufferedImage markEdges(BufferedImage imageToMarkEdgesOf, int sensitivity) {
        //TODO

        return null;
    }

    /**
     *
     *
     * @param imageToMarkEdgesOf
     * @param threshold
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage markEdges(BufferedImage imageToMarkEdgesOf, int threshold, int startX, int startY, int width, int height) {
        //TODO

        return null;
    }

    /**
     *
     *
     * @param imageToMirrorHorizontally
     * @param x
     *
     * @return
     */
    public static BufferedImage mirrorHorizontally(BufferedImage imageToMirrorHorizontally, int x) {
        //TODO

        return null;
    }

    /**
     *
     *
     * @param imageToMirrorVertically
     * @param y
     *
     * @return
     */
    public static BufferedImage mirrorVertically(BufferedImage imageToMirrorVertically, int y) {
        //TODO

        return null;
    }

    public static BufferedImage flare(BufferedImage imageToAddFlareTo, int centerX, int centerY) {
        //TODO

        return null;
    }

    public static BufferedImage cartoonify(BufferedImage imageToCartoonify) {
        //TODO

        return null;
    }

    public static BufferedImage cartoonify(BufferedImage imageToCartoonify, int startX, int startY, int width, int height) {
        //TODO

        return null;
    }

    public static BufferedImage blur(BufferedImage imageToBlur) {
        //TODO

        return null;
    }

    public static BufferedImage blur(BufferedImage imageToBlur, int startX, int startY, int width, int height) {
        //TODO

        return null;
    }

}
