//Create a function that counts the integer's number of digits.
//
//        Examples
//        count(4666) ➞ 4
//
//        count(544) ➞ 3
//
//        count(318) ➞ 3
//
//        count(-92563) ➞ 5
//
//        count(-314890) ➞ 6
//
//        count(654321) ➞ 6
//
//        count(638476) ➞ 6

public class IntegerDigits {
    public static int count(int n) {
        if (n < 0) {
            n *= -1;
        }
        return String.valueOf(n).length();
    }
}