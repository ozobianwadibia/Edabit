//Given an array of integers, return the largest gap between the sorted elements of the array.
//
//        For example, consider the array:
//
//        [9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
//        ... in which, after sorting, the array becomes:
//
//        [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
//        ... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Stretches {
    public static int largestGap(int[] numbers) {
        Arrays.sort(numbers); // sort the given array
        // arraylist to hold the differences between elements
        ArrayList<Integer> myGaps = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            myGaps.add(numbers[i + 1] - numbers[i]);
        }
        return Collections.max(myGaps); // return the max
    }
}