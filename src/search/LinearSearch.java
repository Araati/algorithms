package search;

import util.ArrayGenerator;

public class LinearSearch {

    static final int LENGTH = 100_000_000;

    public static void main(String[] args) {

        int[] array = ArrayGenerator.generateConsistentArray(LENGTH);

        //This is worst case: O(n)
        int target = array[LENGTH-1];

        linearSearch(array, target);
    }

    /*
    Iterate through an array and compare each element
    If element is found, return it
    If not, return null

    Time complexity: O(n)
    Space complexity: O(1)
     */
    private static Integer linearSearch(int[] array, int target)   {
        // unrelated
        int operations = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++)   {
            operations++; // unrelated
            if (array[i] == target) {
                long end = System.currentTimeMillis();
                printResults(target, i, (end-start)/1000, operations);
                return i;
            }
        }
        return null;
    }

    private static void printResults(final int target, final int index,
                                     final long seconds, final int operations) {
        System.out.println("target " + target + " at index " + index);
        System.out.println("time taken " + seconds + " seconds");
        System.out.println("operations done " + operations + ", expected " + LENGTH);
    }

}
