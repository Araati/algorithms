package util;

import java.util.Arrays;
import java.util.Random;

public class ArrayGenerator {

    private static final Random random = new Random();

    public static int[] generateSortedIntArray(int length, int max, int min)   {
        int[] array = generateIntArray(length, max, min);
        Arrays.sort(array);
        return array;
    }

    public static int[] generateIntArray(int length, int max, int min)    {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++)  {
            array[i] = random.nextInt(max - min) + min;
        }
        return array;
    }

    public static int[] generateConsistentArray(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        return array;
    }

    public static int[] generateConsistentReversedArray(int length) {
        int[] array = new int[length];

        for (int i = array.length-1; i >= 0; i--) {
            array[i] = -i+1;
        }
        return array;
    }
}
