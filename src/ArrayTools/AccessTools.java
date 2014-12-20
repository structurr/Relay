package ArrayTools;

/**
 * Created by sam on 12/11/14.
 */
public class AccessTools {

    /**
     * Default constructor
     */
    public AccessTools() { }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     *
     * @return
     */
    public static byte[] getSubArray(byte[] arrayToGetSubArrayFrom, int startIndex) {
        return getSubArray(arrayToGetSubArrayFrom, startIndex, arrayToGetSubArrayFrom.length);
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static byte[] getSubArray(byte[] arrayToGetSubArrayFrom, int startIndex, int endIndex) {
        byte[] subArray = new byte[endIndex - startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arrayToGetSubArrayFrom[i];
        }

        return subArray;
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     *
     * @return
     */
    public static short[] getSubArray(short[] arrayToGetSubArrayFrom, int startIndex) {
        return getSubArray(arrayToGetSubArrayFrom, startIndex, arrayToGetSubArrayFrom.length);
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static short[] getSubArray(short[] arrayToGetSubArrayFrom, int startIndex, int endIndex) {
        short[] subArray = new short[endIndex - startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arrayToGetSubArrayFrom[i];
        }

        return subArray;
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     *
     * @return
     */
    public static int[] getSubArray(int[] arrayToGetSubArrayFrom, int startIndex) {
        return getSubArray(arrayToGetSubArrayFrom, startIndex, arrayToGetSubArrayFrom.length);
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static int[] getSubArray(int[] arrayToGetSubArrayFrom, int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arrayToGetSubArrayFrom[i];
        }

        return subArray;
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     *
     * @return
     */
    public static long[] getSubArray(long[] arrayToGetSubArrayFrom, int startIndex) {
        return getSubArray(arrayToGetSubArrayFrom, startIndex, arrayToGetSubArrayFrom.length);
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static long[] getSubArray(long[] arrayToGetSubArrayFrom, int startIndex, int endIndex) {
        long[] subArray = new long[endIndex - startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arrayToGetSubArrayFrom[i];
        }

        return subArray;
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     *
     * @return
     */
    public static float[] getSubArray(float[] arrayToGetSubArrayFrom, int startIndex) {
        return getSubArray(arrayToGetSubArrayFrom, startIndex, arrayToGetSubArrayFrom.length);
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static float[] getSubArray(float[] arrayToGetSubArrayFrom, int startIndex, int endIndex) {
        float[] subArray = new float[endIndex - startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arrayToGetSubArrayFrom[i];
        }

        return subArray;
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     *
     * @return
     */
    public static double[] getSubArray(double[] arrayToGetSubArrayFrom, int startIndex) {
        return getSubArray(arrayToGetSubArrayFrom, startIndex, arrayToGetSubArrayFrom.length);
    }

    /**
     *
     *
     * @param arrayToGetSubArrayFrom
     * @param startIndex
     * @param endIndex
     *
     * @return
     */
    public static double[] getSubArray(double[] arrayToGetSubArrayFrom, int startIndex, int endIndex) {
        double[] subArray = new double[endIndex - startIndex];

        for (int i = startIndex; i < endIndex; i++) {
            subArray[i - startIndex] = arrayToGetSubArrayFrom[i];
        }

        return subArray;
    }
}
