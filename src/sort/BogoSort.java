package sort;

import util.ArrayGenerator;
import java.util.Random;

public class BogoSort {

    static final int LENGTH = 10;
    static final int MAX = 100;
    static final int MIN = 0;
    static final Random random = new Random();

    public static void main(String[] args) {

        int[] array = ArrayGenerator.generateIntArray(LENGTH, MAX, MIN);
        bogoSort(array);
    }

    /*
    1. Is array sorted?
        Yes: good!
        No: shuffle it and return to 1.

    Time complexity: O(n*n!) aka infinite
    Space complexity: O(1)
     */
    private static void bogoSort(final int[] array) {
        while (!sorted(array))  {
            shuffle(array);
        }
    }

    private static boolean sorted(final int[] array)    {
        for (int i = 0; i < array.length - 1; i++)  {
            if (array[i] > array[i + 1])  {
                return false;
            }
        }
        return true;
    }

    private static void shuffle(final int[] array) {
        for (int i = 0; i < array.length; i++)  {
            int temp = array[i];
            int randomIndex = random.nextInt(array.length);
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

}
