package sort;

import util.ArrayGenerator;

public class SelectionSort {

    static final int LENGTH = 10;
    static final int MAX = 100;
    static final int MIN = 0;

    public static void main(String[] args) {

        int[] array = ArrayGenerator.generateIntArray(LENGTH, MAX, MIN);
        selectionSort(array);
    }

    /*
    Find the smallest element in unsorted part of array
    and place it in the end of sorted part of array

    Time complexity: O(n^2)
    Space complexity: O(1)
     */
    private static void selectionSort(final int[] array) {
        for (int i = 0; i < array.length; i++)   {
            for (int j = i; j < array.length; j++)  {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
