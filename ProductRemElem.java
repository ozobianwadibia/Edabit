//Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to the product of all other elements excluding itself.
//
//        Examples
//        canPartition([2, 8, 4, 1]) ➞ true
//// 8 = 2 x 4 x 1
//
//        canPartition([-1, -10, 1, -2, 20]) ➞ false
//
//        canPartition([-1, -20, 5, -1, -2, 2]) ➞ true

import java.util.Arrays;

public class ProductRemElem {
    public static boolean canPartition(int[] arr) {
        // sort the array:
        // the answer is first or last element
        Arrays.sort(arr);
        int cumProd1 = arr[0]; // first element
        int cumProd2 = arr[arr.length - 1]; // last element
        int tempValue1 = 1;
        int tempValue2 = 1;

        // loop for cumProd2
        for (int i = 0; i < arr.length - 1; i++) {
            tempValue1 *= arr[i];
        }
        if (cumProd2 == tempValue1) {
            return true;
        }
        // loop for cumProd1
        for (int i = 1; i < arr.length; i++) {
            tempValue2 *= arr[i];
        }
        if (cumProd1 == tempValue2) {
            return true;
        }

        return false;
    }
}