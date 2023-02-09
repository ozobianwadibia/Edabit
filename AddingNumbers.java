//Create a function that takes two number strings and returns their sum as a string.
//
//        Examples
//        add("111", "111") ➞ "222"
//
//        add("10", "80") ➞ "90"
//
//        add("", "20") ➞ "Invalid Operation"


public class AddingNumbers {
    public static String add(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            return "Invalid Operation";
        }
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}