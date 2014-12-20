package ImageTools;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by sam on 12/7/14.
 */
public class ColorTools {

    /**
     * Default constructor
     */
    public ColorTools() { }

    /**
     * Returns copy of <code>BufferedImage imageToSetPixelOf</code>
     * with the color value pixel at (x,&nbsp;y) changed to rgb.
     *
     * @param imageToSetPixelOf Image to change pixel of
     * @param x X position of pixel to be changed
     * @param y Y position of pixel to be changed
     * @param rgb RGB color value to change pixel to
     *
     * @return copy of <code>BufferedImage imageToSetPixelOf</code>
     * with the color value pixel at (x,&nbsp;y) changed to rgb
     */
    public static BufferedImage setPixel(BufferedImage imageToSetPixelOf, int x, int y, int rgb) {
        BufferedImage newImage = SelectionTools.copy(imageToSetPixelOf);

        newImage.setRGB(x, y, rgb);

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToSetPixelOf</code>
     * with the color value pixel at (x,&nbsp;y) changed to a new
     * color value created using red, green, and blue.
     *
     * @param imageToSetPixelOf Image to change pixel of
     * @param x X position of pixel to be changed
     * @param y Y position of pixel to be changed
     * @param red Red color value to change pixel to
     * @param green Green color value to change pixel to
     * @param blue Green color value to change pixel to
     *
     * @return copy of <code>BufferedImage imageToSetPixelOf</code>
     * with the color value pixel at (x,&nbsp;y) changed to a new
     * color value created using red, green, and blue
     */
    public static BufferedImage setPixel(BufferedImage imageToSetPixelOf, int x, int y, int red, int green, int blue) {
        BufferedImage newImage = SelectionTools.copy(imageToSetPixelOf);

        newImage.setRGB(x, y, new Color(red, green, blue).getRGB());

        return newImage;
    }

    /**
     * Returns a Color object representing the pixel at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetPixelOf</code>.
     *
     * @param imageToGetPixelOf Image to get pixel RGB color value from
     * @param x X position of pixel to get RGB color value from
     * @param y Y position of pixel to get RGB color value from
     *
     * @return a Color object representing the pixel at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetPixelOf</code>
     */
    public static Color getPixel(BufferedImage imageToGetPixelOf, int x, int y) {
        return new Color(imageToGetPixelOf.getRGB(x, y));
    }

    /**
     * Returns an int representing the red color value at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetRedPixelOf</code>.
     *
     * @param imageToGetRedPixelValueOf Image to get pixel red color value from
     * @param x X position of pixel to get red color value from
     * @param y Y position of pixel to get red color value from
     *
     * @return an int representing the red color value at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetRedPixelOf</code>
     */
    public static int getPixelRed(BufferedImage imageToGetRedPixelValueOf, int x, int y) {
        return getPixel(imageToGetRedPixelValueOf, x, y).getRed();
    }

    /**
     * Returns an int representing the green color value at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetGreenPixelOf</code>.
     *
     * @param imageToGetGreenPixelValueOf Image to get pixel green color value from
     * @param x X position of pixel to get green color value from
     * @param y Y position of pixel to get green color value from
     *
     * @return an int representing the green color value at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetGreenPixelOf</code>
     */
    public static int getPixelGreen(BufferedImage imageToGetGreenPixelValueOf, int x, int y) {
        return getPixel(imageToGetGreenPixelValueOf, x, y).getGreen();
    }

    /**
     * Returns an int representing the blue color value at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetBluePixelOf</code>.
     *
     * @param imageToGetBluePixelValueOf Image to get pixel blue color value from
     * @param x X position of pixel to get blue color value from
     * @param y Y position of pixel to get blue color value from
     *
     * @return an int representing the blue color value at (x,&nbsp;y)
     * of <code>BufferedImage imageToGetBluePixelOf</code>
     */
    public static int getPixelBlue(BufferedImage imageToGetBluePixelValueOf, int x, int y) {
        return getPixel(imageToGetBluePixelValueOf, x, y).getBlue();
    }

    /**
     * Returns copy of <code>BufferedImage imageToFillWIthColor</code>
     * with all pixels replaced with <code>Color fillColor</code>.
     *
     * @param imageToFillWithColor Image to replace pixels of
     * @param fillColor Color to replace all pixels with
     *
     * @return copy of <code>BufferedImage imageToFillWIthColor</code>
     * with all pixels replaced with <code>Color fillColor</code>.
     */
    public static BufferedImage fillWithColor(BufferedImage imageToFillWithColor, Color fillColor) {
        return fillWithColor(imageToFillWithColor, fillColor, 0, 0, imageToFillWithColor.getWidth(), imageToFillWithColor.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToFillWIthColor</code>
     * with all pixels starting from (startX,&nbsp;startY) and ending with
     * (startX + width,&nbsp;startY + height) replaced with
     * <code>Color fillColor</code>.
     *
     * @param imageToFillWithColor Image to replace pixels of
     * @param fillColor Color to replace all pixels with
     * @param startX X position from which to start filling with <code>Color fillColor</code>
     * @param startY Y position from which to start filling with <code>Color fillColor</code>
     * @param width Width of region to fill with <code>Color fillWithColor</code>
     * @param height Height of region to fill with <code>Color fillWithColor</code>
     *
     * @return copy of <code>BufferedImage imageToFillWIthColor</code>
     * with all pixels starting from (startX,&nbsp;startY) and ending with
     * (startX + width,&nbsp;startY + height) replaced with
     * <code>Color fillColor</code>
     */
    public static BufferedImage fillWithColor(BufferedImage imageToFillWithColor, Color fillColor, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToFillWithColor);

        for (int x = startX; x < width + startX; x++) {
            for (int y = startY; y < height + startX; y++) {
                newImage.setRGB(x, y, fillColor.getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToFillWithRandomColor</code>
     * with all pixels replaced with a random color.
     *
     * @param imageToFillWithRandomColor Image to fill with random color
     *
     * @return copy of <code>BufferedImage imageToFillWithRandomColor</code>
     * with all pixels replaced with a random color
     */
    public static BufferedImage fillWithRandomColor(BufferedImage imageToFillWithRandomColor) {
        return fillWithRandomColor(imageToFillWithRandomColor, 0, 0, imageToFillWithRandomColor.getWidth(), imageToFillWithRandomColor.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToFillWithRandomColor</code>
     * with all pixels starting from (startX,&nbsp;startY) and ending with
     * (startX + width,&nbsp;startY + height) replaced with a random color.
     *
     * @param imageToFillWithRandomColor Image to fill with random color
     * @param startX X position from which to start filling with random color
     * @param startY Y position from which to start filling with random color
     * @param width Width of region to fill with random color
     * @param height Height of region to fill with random color
     *
     * @return copy of <code>BufferedImage imageToFillWithRandomColor</code>
     * with all pixels starting from (startX,&nbsp;startY) and ending with
     * (startX + width,&nbsp;startY + height) replaced with a random color
     */
    public static BufferedImage fillWithRandomColor(BufferedImage imageToFillWithRandomColor, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToFillWithRandomColor);
        Random rand = new Random();
        int randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)).getRGB();

        for (int x = startX; x < width + startX; x++) {
            for (int y = startY; y < height + startX; y++) {
                newImage.setRGB(x, y, randomColor);
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToRandomizePixelColorsOf</code>
     * with all pixels replaced with a different random color.
     *
     * @param imageToRandomizePixelColorsOf Image to randomize color of
     *
     * @return copy of <code>BufferedImage imageToRandomizePixelColorsOf</code>
     * with all pixels replaced with a different random color
     */
    public static BufferedImage randomizePixelColors(BufferedImage imageToRandomizePixelColorsOf) {
        return randomizePixelColors(imageToRandomizePixelColorsOf, 0, 0, imageToRandomizePixelColorsOf.getWidth(), imageToRandomizePixelColorsOf.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToRandomizePixelColorsOf</code>
     * with all pixels replaced with a different random color.
     *
     * @param imageToRandomizePixelColorsOf Image to randomize color of
     * @param startX X position from which to start randomizing pixel colors
     * @param startY Y position from which to start randomizing pixel colors
     * @param width Width of region to randomize pixel colors of
     * @param height Height of region to randomize pixel colors of
     *
     * @return copy of <code>BufferedImage imageToRandomizePixelColorsOf</code>
     * with all pixels replaced with a different random color
     */
    public static BufferedImage randomizePixelColors(BufferedImage imageToRandomizePixelColorsOf, int startX, int startY, int width, int height)  {
        BufferedImage newImage = SelectionTools.copy(imageToRandomizePixelColorsOf);

        Random rand = new Random();

        for (int x = startX; x < width + startX; x++) {
            for (int y = startY; y < height + startY; y++) {
                newImage.setRGB(x, y, new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRGBFilterToPixelOf</code>
     * with the red, green, and blue values of the pixel at (x,&nbsp;y) increased
     * by <code>int red</code>, <code>int green</code>, and <code>int blue</code>
     * respectively.
     *
     * @param imageToApplyRGBFilterToPixelOf Image containing the pixel the filter is being applied to
     * @param red Red value to add to pixel
     * @param green Green value to add to pixel
     * @param blue Blue value to add to pixel
     * @param x X position of pixel to apply filter to
     * @param y Y position of pixel to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyRGBFilterToPixelOf</code>
     * with the RGB values of the pixel at (x,&nbsp;y) replaced with
     * <code>int red</code>, <code>int green</code>, and <code>int blue</code>
     */
    public static BufferedImage applyRGBFilterToPixel(BufferedImage imageToApplyRGBFilterToPixelOf, int red, int green, int blue, int x, int y) {
        return applyRGBFilter(imageToApplyRGBFilterToPixelOf, red, green, blue, x, y, 1, 1);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRGBFilterTo</code>
     * with the red, green, and blue values of the entire image increased
     * by <code>int red</code>, <code>int green</code>, and <code>int blue</code>
     * respectively.
     *
     * @param imageToApplyRGBFilterTo Image to apply filter filter to
     * @param red Red value to add to image
     * @param green Green value to add to image
     * @param blue Blue value to add to image
     *
     * @return copy of <code>BufferedImage imageToApplyRGBFilterTo</code>
     * with the red, green, and blue values of the entire image increased
     * by <code>int red</code>, <code>int green</code>, and <code>int blue</code>
     * respectively
     */
    public static BufferedImage applyRGBFilter(BufferedImage imageToApplyRGBFilterTo, int red, int green, int blue) {
        return applyRGBFilter(imageToApplyRGBFilterTo, red, green, blue, 0, 0, imageToApplyRGBFilterTo.getWidth(), imageToApplyRGBFilterTo.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRGBFilterTo</code>
     * with the red, green, and blue values of the region starting at
     * (startX,&nbsp;startY) and ending at (startX + width,&nbsp;startY + height)
     * increased by <code>int red</code>, <code>int green</code>, and
     * <code>int blue</code> respectively.
     *
     * @param imageToApplyRGBFilterTo Image to apply filter to
     * @param red Red value to add to image
     * @param green Green value to add to image
     * @param blue Blue value to add to image
     * @param startX X position from which to start applying filter to
     * @param startY Y position from which to start applying filter to
     * @param width Width of region to apply filter to
     * @param height Height of region to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyRGBFilterTo</code>
     * with the red, green, and blue values of the region starting at
     * (startX,&nbsp;startY) and ending at (startX + width,&nbsp;startY + height)
     * increased by <code>int red</code>, <code>int green</code>, and
     * <code>int blue</code> respectively
     */
    public static BufferedImage applyRGBFilter(BufferedImage imageToApplyRGBFilterTo, int red, int green, int blue, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToApplyRGBFilterTo);

        for (int x = startX; x < width + startX; x++) {
            for (int y = startY; y < height + startY; y++) {
                Color rgbValue = new Color(imageToApplyRGBFilterTo.getRGB(x, y));

                newImage.setRGB(x, y,
                        new Color(GeneralUtilities.colorRangeTrap(rgbValue.getRed() + red),
                                GeneralUtilities.colorRangeTrap(rgbValue.getGreen() + green),
                                GeneralUtilities.colorRangeTrap(rgbValue.getBlue() + blue)).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRedFilterToPixelOf</code>
     * with the red value of the pixel at (x,&nbsp;y) increased by
     * <code>int red</code>.
     *
     * @param imageToApplyRedFilterToPixelOf Image containing the pixel to apply filter to
     * @param red Red value to add to pixel
     * @param x X position of pixel to apply filter to
     * @param y Y position of pixel to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyRedFilterToPixelOf</code>
     * with the red value of the pixel at (x,&nbsp;y) increased by
     * <code>int red</code>
     */
    public static BufferedImage applyRedFilterToPixel(BufferedImage imageToApplyRedFilterToPixelOf, int red, int x, int y) {
        return applyRGBFilterToPixel(imageToApplyRedFilterToPixelOf, red, 0, 0, x, y);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the red value of the entire image increased by <code>int red</code>.
     *
     * @param imageToApplyRedFilterTo Image to apply filter to
     * @param red Red value to add to image
     *
     * @return copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the red value of the entire image increased by <code>int red</code>
     */
    public static BufferedImage applyRedFilter(BufferedImage imageToApplyRedFilterTo, int red) {
        return applyRGBFilter(imageToApplyRedFilterTo, red, 0, 0);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the red value of the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) increased by
     * <code>int red</code>.
     *
     * @param imageToApplyRedFilterTo Image to apply filter to
     * @param red Red value to add to image
     * @param startX X position from which to start applying filter to
     * @param startY Y position from which to start applying filter to
     * @param width Width of region to apply filter to
     * @param height Height of region to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the red value of the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) increased by
     * <code>int red</code>
     */
    public static BufferedImage applyRedFilter(BufferedImage imageToApplyRedFilterTo, int red, int startX, int startY, int width, int height) {
        return applyRGBFilter(imageToApplyRedFilterTo, red, 0, 0, startX, startY, width, height);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyGreenFilterToPixelOf</code>
     * with the green value of the pixel at (x,&nbsp;y) increased by
     * <code>int green</code>.
     *
     * @param imageToApplyGreenFilterToPixelOf Image containing the pixel to apply filter to
     * @param green Green value to add to pixel
     * @param x X position of pixel to apply filter to
     * @param y Y position of pixel to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyRedFilterToPixelOf</code>
     * with the green value of the pixel at (x,&nbsp;y) increased by
     * <code>int green</code>
     */
    public static BufferedImage applyGreenFilterToPixel(BufferedImage imageToApplyGreenFilterToPixelOf, int green, int x, int y) {
        return applyRGBFilterToPixel(imageToApplyGreenFilterToPixelOf, green, 0, 0, x, y);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the red value of the entire image increased by <code>int red</code>.
     *
     * @param imageToApplyGreenFilterTo Image to apply filter to
     * @param green Green value to add to image
     *
     * @return copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the green value of the entire image increased by <code>int green</code>
     */
    public static BufferedImage applyGreenFilter(BufferedImage imageToApplyGreenFilterTo, int green) {
        return applyRGBFilter(imageToApplyGreenFilterTo, 0, green, 0);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyGreenFilterTo</code>
     * with the green value of the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) increased by
     * <code>int green</code>.
     *
     * @param imageToApplyGreenFilterTo Image to apply filter to
     * @param green Green value to add to image
     * @param startX X position from which to start applying filter to
     * @param startY Y position from which to start applying filter to
     * @param width Width of region to apply filter to
     * @param height Height of region to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyRedFilterTo</code>
     * with the green value of the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) increased by
     * <code>int green</code>
     */
    public static BufferedImage applyGreenFilter(BufferedImage imageToApplyGreenFilterTo, int green, int startX, int startY, int width, int height) {
        return applyRGBFilter(imageToApplyGreenFilterTo, 0, green, 0, startX, startY, width, height);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyBlueFilterToPixelOf</code>
     * with the blue value of the pixel at (x,&nbsp;y) increased by
     * <code>int blue</code>.
     *
     * @param imageToApplyBlueFilterToPixelOf Image containing the pixel to apply filter to
     * @param blue Blue value to add to pixel
     * @param x X position of pixel to apply filter to
     * @param y Y position of pixel to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyBlueFilterToPixelOf</code>
     * with the blue value of the pixel at (x,&nbsp;y) increased by
     * <code>int blue</code>
     */
    public static BufferedImage applyBlueFilterToPixel(BufferedImage imageToApplyBlueFilterToPixelOf, int blue, int x, int y) {
        return applyRGBFilterToPixel(imageToApplyBlueFilterToPixelOf, blue, 0, 0, x, y);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyBlueFilterTo</code>
     * with the blue value of the entire image increased by <code>int blue</code>.
     *
     * @param imageToApplyBlueFilterTo Image to apply filter to
     * @param blue Blue value to add to image
     *
     * @return copy of <code>BufferedImage imageToApplyBlueFilterTo</code>
     * with the blue value of the entire image increased by <code>int blue</code>
     */
    public static BufferedImage applyBlueFilter(BufferedImage imageToApplyBlueFilterTo, int blue) {
        return applyRGBFilter(imageToApplyBlueFilterTo, 0, 0, blue);
    }

    /**
     * Returns copy of <code>BufferedImage imageToApplyBlueFilterTo</code>
     * with the blue value of the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) increased by
     * <code>int blue</code>.
     *
     * @param imageToApplyBlueFilterTo Image to apply filter to
     * @param blue Blue value to add to image
     * @param startX X position from which to start applying filter to
     * @param startY Y position from which to start applying filter to
     * @param width Width of region to apply filter to
     * @param height Height of region to apply filter to
     *
     * @return copy of <code>BufferedImage imageToApplyBlueFilterTo</code>
     * with the blue value of the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) increased by
     * <code>int blue</code>
     */
    public static BufferedImage applyBlueFilter(BufferedImage imageToApplyBlueFilterTo, int blue, int startX, int startY, int width, int height) {
        return applyRGBFilter(imageToApplyBlueFilterTo, 0, 0, blue, startX, startY, width, height);
    }

    /**
     * Returns copy of <code>BufferedImage imageToRemoveRedFrom</code>
     * with the red color values of the entire image set to 0.
     *
     * @param imageToRemoveRedFrom Image to remove red channel from
     *
     * @return copy of <code>BufferedImage imageToRemoveRedFrom</code>
     * with the red color values of the entire image set to 0
     */
    public static BufferedImage removeRed(BufferedImage imageToRemoveRedFrom) {
        return removeRed(imageToRemoveRedFrom, 0, 0, imageToRemoveRedFrom.getWidth(), imageToRemoveRedFrom.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToRemoveRedFrom</code>
     * with the red color values in the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) set to 0.
     *
     * @param imageToRemoveRedFrom Image to remove red channel from
     * @param startX X position from which to start removing red channel
     * @param startY Y position from which to start removing red channel
     * @param width Width of region to start removing red channel from
     * @param height Height of region to start removing red channel from
     *
     * @return copy of <code>BufferedImage imageToRemoveRedFrom</code>
     * with the red color values in the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) set to 0
     */
    public static BufferedImage removeRed(BufferedImage imageToRemoveRedFrom, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToRemoveRedFrom);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                newImage.setRGB(x, y, new Color(0, getPixelGreen(imageToRemoveRedFrom, x, y), getPixelBlue(imageToRemoveRedFrom, x, y)).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToRemoveRedFrom</code>
     * with the green color values of the entire image set to 0.
     *
     * @param imageToRemoveGreenFrom Image to remove green channel from
     *
     * @return copy of <code>BufferedImage imageToRemoveGreenFrom</code>
     * with the green color values of the entire image set to 0
     */
    public static BufferedImage removeGreen(BufferedImage imageToRemoveGreenFrom) {
        return removeGreen(imageToRemoveGreenFrom, 0, 0, imageToRemoveGreenFrom.getWidth(), imageToRemoveGreenFrom.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToRemoveGreenFrom</code>
     * with the green color values in the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) set to 0.
     *
     * @param imageToRemoveGreenFrom Image to remove green channel from
     * @param startX X position from which to start removing green channel
     * @param startY Y position from which to start removing green channel
     * @param width Width of region to start removing green channel from
     * @param height Height of region to start removing green channel from
     *
     * @return copy of <code>BufferedImage imageToRemoveGreenFrom</code>
     * with the green color values in the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) set to 0
     */
    public static BufferedImage removeGreen(BufferedImage imageToRemoveGreenFrom, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToRemoveGreenFrom);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                newImage.setRGB(x, y, new Color(getPixelRed(imageToRemoveGreenFrom, x, y), 0, getPixelBlue(imageToRemoveGreenFrom, x, y)).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToRemoveRedFrom</code>
     * with the blue color values of the entire image set to 0.
     *
     * @param imageToRemoveBlueFrom Image to remove blue channel from
     *
     * @return copy of <code>BufferedImage imageToRemoveBlueFrom</code>
     * with the blue color values of the entire image set to 0
     */
    public static BufferedImage removeBlue(BufferedImage imageToRemoveBlueFrom) {
        return removeBlue(imageToRemoveBlueFrom, 0, 0, imageToRemoveBlueFrom.getWidth(), imageToRemoveBlueFrom.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToRemoveBlueFrom</code>
     * with the blue color values in the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) set to 0.
     *
     * @param imageToRemoveBlueFrom Image to remove blue channel from
     * @param startX X position from which to start removing blue channel
     * @param startY Y position from which to start removing blue channel
     * @param width Width of region to start removing blue channel from
     * @param height Height of region to start removing blue channel from
     *
     * @return copy of <code>BufferedImage imageToRemoveBlueFrom</code>
     * with the blue color values in the region starting at (startX,&nbsp;startY)
     * and ending at (startX + width,&nbsp;startY + height) set to 0
     */
    public static BufferedImage removeBlue(BufferedImage imageToRemoveBlueFrom, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToRemoveBlueFrom);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                newImage.setRGB(x, y, new Color(getPixelRed(imageToRemoveBlueFrom, x, y), getPixelGreen(imageToRemoveBlueFrom, x, y), 0).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToKeepOnlyRedOf</code>
     * with the green and blue color values from the entire image
     * set to 0.
     *
     * @param imageToKeepOnlyRedOf Image to remove green and blue channels from
     *
     * @return copy of <code>BufferedImage imageToKeepOnlyRedOf</code>
     * with the green and blue color values from the entire image
     * set to 0
     */
    public static BufferedImage keepOnlyRed(BufferedImage imageToKeepOnlyRedOf) {
        return keepOnlyRed(imageToKeepOnlyRedOf, 0, 0, imageToKeepOnlyRedOf.getWidth(), imageToKeepOnlyRedOf.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToKeepOnlyRedOf</code>
     * with the green and blue color values from the region starting
     * at (startX, startY) and ending at (startX + width, startY + height)
     * set to 0.
     *
     * @param imageToKeepOnlyRedOf Image to remove green and blue channels from
     * @param startX X position from which to start removing channels
     * @param startY Y position from which to start removing channels
     * @param width Width of region to remove channels from
     * @param height Height of region to remove channels from
     *
     * @return copy of <code>BufferedImage imageToKeepOnlyRedOf</code>
     * with the green and blue color values from the region starting
     * at (startX, startY) and ending at (startX + width, startY + height)
     * set to 0
     */
    public static BufferedImage keepOnlyRed(BufferedImage imageToKeepOnlyRedOf, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToKeepOnlyRedOf);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                int red = new Color(newImage.getRGB(x, y)).getRed();

                newImage.setRGB(x, y, new Color(red, 0, 0).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToKeepOnlyGreenOf</code>
     * with the red and blue color values from the entire image
     * set to 0.
     *
     * @param imageToKeepOnlyGreenOf Image to remove green and green channels from
     *
     * @return copy of <code>BufferedImage imageToKeepOnlyGreenOf</code>
     * with the green and green color values from the entire image
     * set to 0
     */
    public static BufferedImage keepOnlyGreen(BufferedImage imageToKeepOnlyGreenOf) {
        return keepOnlyGreen(imageToKeepOnlyGreenOf, 0, 0, imageToKeepOnlyGreenOf.getWidth(), imageToKeepOnlyGreenOf.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToKeepOnlyGreenOf</code>
     * with the red and blue color values from the region starting
     * at (startX, startY) and ending at (startX + width, startY + height)
     * set to 0.
     *
     * @param imageToKeepOnlyGreenOf Image to remove red and blue channels from
     * @param startX X position from which to start removing channels
     * @param startY Y position from which to start removing channels
     * @param width Width of region to remove channels from
     * @param height Height of region to remove channels from
     *
     * @return copy of <code>BufferedImage imageToKeepOnlyGreenOf</code>
     * with the green and blue color values from the region starting
     * at (startX, startY) and ending at (startX + width, startY + height)
     * set to 0
     */
    public static BufferedImage keepOnlyGreen(BufferedImage imageToKeepOnlyGreenOf, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToKeepOnlyGreenOf);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                int green = new Color(newImage.getRGB(x, y)).getGreen();

                newImage.setRGB(x, y, new Color(0, green, 0).getRGB());
            }
        }

        return newImage;
    }

    /**
     * Returns copy of <code>BufferedImage imageToKeepOnlyBlueOf</code>
     * with the red and green color values from the entire image
     * set to 0.
     *
     * @param imageToKeepOnlyBlueOf Image to remove green and blue channels from
     *
     * @return copy of <code>BufferedImage imageToKeepOnlyBlueOf</code>
     * with the green and blue color values from the entire image
     * set to 0
     */
    public static BufferedImage keepOnlyBlue(BufferedImage imageToKeepOnlyBlueOf) {
        return keepOnlyBlue(imageToKeepOnlyBlueOf, 0, 0, imageToKeepOnlyBlueOf.getWidth(), imageToKeepOnlyBlueOf.getHeight());
    }

    /**
     * Returns copy of <code>BufferedImage imageToKeepOnlyBlueOf</code>
     * with the red and green color values from the region starting
     * at (startX, startY) and ending at (startX + width, startY + height)
     * set to 0.
     *
     * @param imageToKeepOnlyBlueOf Image to remove red and green channels from
     * @param startX X position from which to start removing channels
     * @param startY Y position from which to start removing channels
     * @param width Width of region to remove channels from
     * @param height Height of region to remove channels from
     *
     * @return copy of <code>BufferedImage imageToKeepOnlyBlueOf</code>
     * with the red and green color values from the region starting
     * at (startX, startY) and ending at (startX + width, startY + height)
     * set to 0
     */
    public static BufferedImage keepOnlyBlue(BufferedImage imageToKeepOnlyBlueOf, int startX, int startY, int width, int height) {
        BufferedImage newImage = SelectionTools.copy(imageToKeepOnlyBlueOf);

        for (int x = startX; x < width; x++) {
            for (int y = startY; y < height; y++) {
                int blue = new Color(newImage.getRGB(x, y)).getBlue();

                newImage.setRGB(x, y, new Color(0, 0, blue).getRGB());
            }
        }

        return newImage;
    }

    public static BufferedImage replaceColor(BufferedImage imageToReplaceColorOf, Color colorToReplace) {
        //TODO

        return null;
    }

    public static BufferedImage replaceColor(BufferedImage imageToReplaceColorOf, Color colorToReplace, int startX, int startY, int width, int height) {
        //TODO

        return null;
    }

}
