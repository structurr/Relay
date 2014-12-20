package MathTools;

import ArrayTools.AccessTools;
import ArrayTools.ModifyTools;

/**
 * Created by sam on 12/7/14.
 */
public class ArithmeticTools {

    /**
     * Default constructor
     */
    public ArithmeticTools() { }

    public static byte add(byte[] numbersToAdd) {
        byte sum = 0;

        for (byte arrayElement : numbersToAdd) {
            sum += arrayElement;
        }

        return sum;
    }

    public static short add(short[] numbersToAdd) {
        short sum = 0;

        for (short arrayElement : numbersToAdd) {
            sum += arrayElement;
        }

        return sum;
    }

    public static int add(int[] numbersToAdd) {
        int sum = 0;

        for (int arrayElement : numbersToAdd) {
            sum += arrayElement;
        }

        return sum;
    }

    public static long add(long[] numbersToAdd) {
        long sum = 0;

        for (long arrayElement : numbersToAdd) {
            sum += arrayElement;
        }

        return sum;
    }

    public static float add(float[] numbersToAdd) {
        float sum = 0;

        for (float arrayElement : numbersToAdd) {
            sum += arrayElement;
        }

        return sum;
    }

    public static double add(double[] numbersToAdd) {
        double sum = 0;

        for (double arrayElement : numbersToAdd) {
            sum += arrayElement;
        }

        return sum;
    }

    public static byte subtract(byte numberToBeginWith, byte[] numbersToSubtract) {
        byte difference = numberToBeginWith;

        for (byte arrayElement : numbersToSubtract) {
            difference -= arrayElement;
        }

        return difference;
    }

    public static short subtract(short numberToBeginWith, short[] numbersToSubtract) {
        short difference = numberToBeginWith;

        for (short arrayElement : numbersToSubtract) {
            difference -= arrayElement;
        }

        return difference;
    }

    public static int subtract(int numberToBeginWith, int[] numbersToSubtract) {
        int difference = numberToBeginWith;

        for (int arrayElement : numbersToSubtract) {
            difference -= arrayElement;
        }

        return difference;
    }

    public static long subtract(long numberToBeginWith, long[] numbersToSubtract) {
        long difference = numberToBeginWith;

        for (long arrayElement : numbersToSubtract) {
            difference -= arrayElement;
        }

        return difference;
    }

    public static float subtract(float numberToBeginWith, float[] numbersToSubtract) {
        float difference = numberToBeginWith;

        for (float arrayElement : numbersToSubtract) {
            difference -= arrayElement;
        }

        return difference;
    }

    public static double subtract(double numberToBeginWith, double[] numbersToSubtract) {
        double difference = numberToBeginWith;

        for (double arrayElement : numbersToSubtract) {
            difference -= arrayElement;
        }

        return difference;
    }

    public static byte multiply(byte[] numbersToMultiply) {
        byte product = 1;

        for (double arrayElement : numbersToMultiply) {
            product *= arrayElement;
        }

        return product;
    }

    public static short multiply(short[] numbersToMultiply) {
        short product = 1;

        for (double arrayElement : numbersToMultiply) {
            product *= arrayElement;
        }

        return product;
    }

    public static int multiply(int[] numbersToMultiply) {
        int product = 1;

        for (double arrayElement : numbersToMultiply) {
            product *= arrayElement;
        }

        return product;
    }

    public static long multiply(long[] numbersToMultiply) {
        long product = 1;

        for (double arrayElement : numbersToMultiply) {
            product *= arrayElement;
        }

        return product;
    }

    public static float multiply(float[] numbersToMultiply) {
        float product = 1;

        for (double arrayElement : numbersToMultiply) {
            product *= arrayElement;
        }

        return product;
    }

    public static double multiply(double[] numbersToMultiply) {
        double product = 1;

        for (double arrayElement : numbersToMultiply) {
            product *= arrayElement;
        }

        return product;
    }

    public static byte divide(byte numberToBeginWith, byte[] numbersToDivideBy) {
        byte quotient = numberToBeginWith;

        for (byte arrayElement : numbersToDivideBy) {
            quotient *= arrayElement;
        }

        return quotient;
    }

    public static short divide(short numberToBeginWith, short[] numbersToDivideBy) {
        short quotient = numberToBeginWith;

        for (short arrayElement : numbersToDivideBy) {
            quotient *= arrayElement;
        }

        return quotient;
    }

    public static int divide(int numberToBeginWith, int[] numbersToDivideBy) {
        int quotient = numberToBeginWith;

        for (int arrayElement : numbersToDivideBy) {
            quotient *= arrayElement;
        }

        return quotient;
    }

    public static long divide(long numberToBeginWith, long[] numbersToDivideBy) {
        long quotient = numberToBeginWith;

        for (long arrayElement : numbersToDivideBy) {
            quotient *= arrayElement;
        }

        return quotient;
    }

    public static float divide(float numberToBeginWith, float[] numbersToDivideBy) {
        float quotient = numberToBeginWith;

        for (float arrayElement : numbersToDivideBy) {
            quotient *= arrayElement;
        }

        return quotient;
    }

    public static double divide(double numberToBeginWith, double[] numbersToDivideBy) {
        double quotient = numberToBeginWith;

        for (double arrayElement : numbersToDivideBy) {
            quotient *= arrayElement;
        }

        return quotient;
    }

}
