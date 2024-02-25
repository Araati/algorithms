package search;

import util.ArrayGenerator;

public class BinarySearch {

    static final int LENGTH = 100_000_000;

    public static void main(String[] args) {

        int[] array = ArrayGenerator.generateConsistentArray(LENGTH);

        //This is worst case: O(log n)
        int target = array[0];

        binarySearch(array, target);
    }

    /*
    Take middle element by index between borders
    If it's higher than target, rightBorder = middle index
    If it's lower than target, leftBorder = middle index
    If it's equals target, return index
    Repeat until victory or until the borders are equal (it means there no target)

    Time complexity: O(log n)
    Space complexity O(1)
     */
    private static Integer binarySearch(final int[] array, final int target)  {
        // unrelated
        int operations = 0;
        long start = System.currentTimeMillis();

        int left = 0;
        int right = array.length - 1;
        while (left <= right)  {
            operations++; // unrelated
            int mid = (left+right)/2;
            if (array[mid] > target)  {
                right = mid;
            } else if (array[mid] < target) {
                left = mid;
            } else {
                long end = System.currentTimeMillis(); // unrelated
                printResults(target, mid, (end-start)/1000, operations); // unrelated
                return target;
            }
        }
        return null;
    }

    private static void printResults(final int target, final int mid,
                                     final long seconds, final int operations) {
        System.out.println("target " + target + " at index " + mid);
        System.out.println("time taken " + seconds + " seconds");
        System.out.println("operations done " + operations + ", expected " + Math.round(Math.log(LENGTH)/Math.log(2)));
    }

}
