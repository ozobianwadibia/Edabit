//You have a pack of 5 randomly numbered cards, which can range from 0-9. You can win if you can produce a higher two-digit number from your cards than your opponent. Return true if your cards win that round.
//
//        Examples
//        winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
//// Your cards can make the number 96
//// Your opponent can make the number 73
//// You win the round since 96 > 73
//
//        winRound([2, 5, 2, 6, 9], [3, 7, 3, 1, 2]) ➞ true
//
//        winRound([1, 2, 3, 4, 5], [9, 8, 7, 6, 5]) ➞ false
//
//        winRound([4, 3, 4, 4, 5], [3, 2, 5, 4, 1]) ➞ false


import java.util.ArrayList;
import java.util.Arrays;

public class NumberedCard {

    /**
     * Method to extract the last two digits of the array
     * @param someArray the array
     * @return last two digits of sorted array, inverted
     */
    private static int extractLastTwoDigits(int[] someArray) {
        // sort the array
        Arrays.sort(someArray);
        // arraylist to hold the last two digits of sorted array
        ArrayList<String> twoDigitArrayList = new ArrayList<>();
        for (int i = 0; i < someArray.length; i++) {
            twoDigitArrayList.add(String.valueOf(someArray[someArray.length - 1]));
            twoDigitArrayList.add(String.valueOf(someArray[someArray.length - 2]));
        }
        // concatenation of the digits
        String youNUm = twoDigitArrayList.get(0) + twoDigitArrayList.get(1);
        return Integer.parseInt(youNUm);
    }
    public static boolean winRound(int[] you, int[] opp) {
        return extractLastTwoDigits(you) > extractLastTwoDigits(opp);
    }
}