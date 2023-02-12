//Given a string, reverse all the words which have odd length. The even length words are not changed.
//
//        Examples
//        reverseOdd("Bananas") ➞ "sananaB"
//
//        reverseOdd("One two three four") ➞ "enO owt eerht four"
//
//        reverseOdd("Make sure uoy only esrever sdrow of ddo length")
//        ➞ "Make sure you only reverse words of odd length"

public class OddLengthWords {
    private static String revOneWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String reverseOdd(String str) {
        String[] splitString = str.split(" ");
        for (int i = 0; i < splitString.length; i++) {
            if (splitString[i].length() % 2 != 0) {
                splitString[i] = revOneWord(splitString[i]);
            }
        }
        return String.join(" ", splitString);
    }
}