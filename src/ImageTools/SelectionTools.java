package ImageTools;

import java.awt.image.BufferedImage;
import java.nio.BufferOverflowException;

/**
 * Created by sam on 12/7/14.
 */
public class SelectionTools {

    /**
     * Default constructor
     */
    public SelectionTools() { }

    /**
     * Returns copy of entire <code>BufferedImage imageToCopy</code>.
     *
     * @param imageToCopy Image from which to copy from
     *
     * @return copy of entire <code>BufferedImage imageToCopy</code>
     */
    public static BufferedImage copy(BufferedImage imageToCopy) {
        return copy(imageToCopy, 0, 0, imageToCopy.getWidth(), imageToCopy.getHeight());
    }

    /**
     * Returns copy of a snippet from <code>BufferedImage imageToCopy</code>
     * starting at (startX,&nbsp;startY) and ending at
     * (startX + width,&nbsp;startY + height).
     *
     * @param imageToCopy Image from which to copy from
     * @param startX X position from which to start copying
     * @param startY Y position from which to start copying
     * @param width Width of region to copy
     * @param height Height of region to copy
     *
     * @return copy of a snippet from <code>BufferedImage imageToCopy</code>
     */
    public static BufferedImage copy(BufferedImage imageToCopy, int startX, int startY, int width, int height) {
        BufferedImage newImage = new BufferedImage(width, height, imageToCopy.getType());

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                newImage.setRGB(x, y, imageToCopy.getRGB(x + startX, y + startY));
            }
        }

        return newImage;
    }

    /**
     * Returns copy of cropped region from <code>BufferedImage imageToCopy</code>
     * starting at (startX,&nbsp;startY) and ending at
     * (starX + width,&nbsp;startY + height).
     *
     * @param imageToCrop Image to crop
     * @param startX X position from which to start cropping
     * @param startY Y position from which to start cropping
     * @param width Width of region to crop
     * @param height Height of region to crop
     *
     * @return copy of a cropped region from <code>BufferedImage imageToCopy</code>
     *
     * @see #copy(java.awt.image.BufferedImage)
     * @see #copy(java.awt.image.BufferedImage, int, int, int, int)
     */
    public static BufferedImage crop(BufferedImage imageToCrop, int startX, int startY, int width, int height) {
        return copy(imageToCrop, startX, startY, width, height);
    }

    public static BufferedImage circleCrop(BufferedImage imageToCrop, int containingBoxStartX, int containingBoxStartY, int conatiningBoxWidth, int containingBoxHeight) {
        //TODO

        return null;
    }

    /**
     * Returns copy of <code>BufferedImage imageToPasteTo</code> with
     * entire <code>BufferedImage imagePaste</code> pasted on top starting
     * at (0,&nbsp;0).
     *
     * @param imageToPasteTo Image to receive the paste task
     * @param imageToPaste Image to be pasted
     *
     * @return copy of <code>BufferedImage imageToPasteTo</code> with
     * entire <code>BufferedImage imagePaste</code> pasted on top
     */
    public static BufferedImage paste(BufferedImage imageToPasteTo, BufferedImage imageToPaste) {
        return paste(imageToPasteTo, imageToPaste, 0, 0);
    }

    /**
     * Returns copy of <code>BufferedImage imageToPasteTo</code> with
     * entire <code>BufferedImage imagePaste</code> pasted on top starting
     * at (startXOfReceivingImage,&nbsp;startYOfReceivingImage).
     *
     * @param imageToPasteTo Image to receive the paste task
     * @param imageToPaste Image to be pasted
     * @param startXOfReceivingImage X position from which to start pasting
     * @param startYOfReceivingImage Y position from which to start pasting
     *
     * @return copy of <code>BufferedImage imageToPasteTo</code> with
     * entire <code>BufferedImage imagePaste</code> pasted on top
     */
    public static BufferedImage paste(BufferedImage imageToPasteTo, BufferedImage imageToPaste, int startXOfReceivingImage, int startYOfReceivingImage) {
        BufferedImage newImage = copy(imageToPasteTo);

        for (int x = 0; x < ((imageToPaste.getWidth() < imageToPasteTo.getWidth() - startXOfReceivingImage) ? imageToPaste.getWidth() : imageToPasteTo.getWidth() - startXOfReceivingImage); x++) {
            for (int y = 0; y < ((imageToPaste.getHeight() < imageToPasteTo.getHeight() - startYOfReceivingImage) ? imageToPaste.getHeight() : imageToPasteTo.getHeight() - startYOfReceivingImage); y++) {
                newImage.setRGB(x + startXOfReceivingImage, y + startYOfReceivingImage, imageToPaste.getRGB(x, y));

                System.out.println(x + startXOfReceivingImage + "\t" + (y + startYOfReceivingImage));
            }
        }

        return newImage;
    }

    /**
     *
     *
     * @param imageToErase
     *
     * @return
     */
    public static BufferedImage erase(BufferedImage imageToErase) {
        //TODO

        return null;
    }

    /**
     *
     *
     * @param imageToErase
     * @param startX
     * @param startY
     * @param width
     * @param height
     *
     * @return
     */
    public static BufferedImage erase(BufferedImage imageToErase, int startX, int startY, int width, int height) {
        //TODO

        return null;
    }

    /**
     *
     *
     * @param imageToRotate
     * @param angle
     * @param cropToRemoveWhitespace
     *
     * @return
     */
    public static BufferedImage rotate(BufferedImage imageToRotate, double angle, boolean cropToRemoveWhitespace) {
        //TODO

        return null;
    }

}
