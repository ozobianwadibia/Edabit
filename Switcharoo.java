//Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
//
//        If the length of the string is less than two, return "Incompatible.".
//        If the first and last characters are the same, return "Two's a pair.".
//        Examples
//        flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
//
//        flipEndChars("ada") ➞ "Two's a pair."
//
//        flipEndChars("Ada") ➞ "adA"
//
//        flipEndChars("z") ➞ "Incompatible."

public class Switcharoo {
    public static String flipEndChars(String s) {
        if (s.length() < 2) {
            return "Incompatible.";
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return "Two's a pair.";
        }
        // extract the first character as a string
        String first = String.valueOf(s.charAt(0));
        // extract the last character as a string
        String last = String.valueOf(s.charAt(s.length() - 1));
        // string builder object for the string
        StringBuilder sb = new StringBuilder(s);
        // delete the last character
        sb.deleteCharAt(sb.length() - 1);
        // delete the first character
        sb.deleteCharAt(0);
        // append the deleted characters in reverse order
        sb.append(first);
        sb.insert(0, last);
        return sb.toString();
    }
}