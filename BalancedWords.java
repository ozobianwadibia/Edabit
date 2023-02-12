//We can assign a value to each character in a word, based on their position in the alphabet (a = 1, b = 2, ... , z = 26). A balanced word is one where the sum of values on the left-hand side of the word equals the sum of values on the right-hand side. For odd length words, the middle character (balance point) is ignored.
//
//        Write a function that returns true if the word is balanced, and false if it's not.
//
//        Examples
//        balanced("zips") ➞ true
//// "zips" = "zi|ps" = 26+9|16+19 = 35|35 = true
//
//        balanced("brake") ➞ false
//// "brake" = "br|ke" = 2+18|11+5 = 20|16 = false
//        Notes
//        All words will be lowercase, and have a minimum of 2 characters.
//        Palindromic words will always be balanced.


import java.util.HashMap;

public class BalancedWords {

    /**
     * Method to sum integer representation of chars
     * @param hm the HashMap
     * @param str the string to be compared
     * @return an integer sum
     */
    private static int sumOfChars(HashMap<Integer, String> hm, String str) {
        int sumStr = 0;
        for (int key : hm.keySet()) {
            for (int i = 0; i < str.length(); i++) {
                if (String.valueOf(str.charAt(i)).equals(hm.get(key))) {
                    sumStr += key;
                }
            }
        }
        return sumStr;
    }

    /**
     * Method to solve balanced words problem
     * @param word the word to be inspected
     * @return boolean, true or false
     */
    public static boolean balanced(String word) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.put(4, "d");
        hm.put(5, "e");
        hm.put(6, "f");
        hm.put(7, "g");
        hm.put(8, "h");
        hm.put(9, "i");
        hm.put(10, "j");
        hm.put(11, "k");
        hm.put(12, "l");
        hm.put(13, "m");
        hm.put(14, "n");
        hm.put(15, "o");
        hm.put(16, "p");
        hm.put(17, "q");
        hm.put(18, "r");
        hm.put(19, "s");
        hm.put(20, "t");
        hm.put(21, "u");
        hm.put(22, "v");
        hm.put(23, "w");
        hm.put(24, "x");
        hm.put(25, "y");
        hm.put(26, "z");

        String leftHalf = "";
        String rightHalf = "";

       if (word.length() % 2 == 0) {
           leftHalf += word.substring(0, word.length() / 2);
           rightHalf += word.substring((word.length() / 2));
       }

        if (word.length() % 2 != 0) {
          leftHalf = word.substring(0, word.length() / 2);
          rightHalf = word.substring((word.length() / 2) + 1);
        }

        int sumLeft = sumOfChars(hm, leftHalf);
        int sumRight = sumOfChars(hm, rightHalf);

        return sumLeft == sumRight;
    }
}