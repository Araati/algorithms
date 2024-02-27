package sort;

import util.ArrayGenerator;

public class BubbleSort {

    static final int LENGTH = 10;

    public static void main(String[] args) {

        // Worst case, O(n^2)
        int[] array = ArrayGenerator.generateConsistentReversedArray(LENGTH);
        bubbleSort(array);

        // Best case, O(n)
        array = ArrayGenerator.generateConsistentArray(LENGTH);
        bubbleSort(array);
    }

    /*
    Comparing two closest elements
    If the left is larger than the right - swap.

    Time complexity: O(n^2)
    Space complexity: O(1)
     */
    private static void bubbleSort(final int[] array)    {
        boolean unsorted = true;
        int operations = 0; // unrelated

        while (unsorted) {
            unsorted = false;
            for (int i = 1; i < array.length; i++)  {
                if (array[i-1] > array[i])  {
                    swap(array, i-1, i);
                    unsorted = true;
                }
                operations++; // unrelated
            }
            operations++; // unrelated
        }
        System.out.println("Operations count " + operations); // unrelated
    }

    private static void swap(final int[] array, final int firstIndex, final int secondIndex)    {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
