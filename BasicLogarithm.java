//A logarithm is kind of like reverse exponents. There is a base and a number in a logarithm. The point of a logarithm is to find out what power you have to raise for the base to get the number next to the base. For example:
//
//        log base 5 of 25 = x
//
//        This is the same thing as saying 5 raised to the power of x is 25, which is 2 (so x would be 2). Using this example, your function must take the 5 and 25 and returns 2.
//        Examples
//
//        logarithm(5, 25) ➞ 2
//
//        logarithm(2, 64) ➞ 6
//
//        logarithm(2, 4) ➞ 2
//
//        Notes
//
//        All inputs and their associated outputs are integers.
//        Return "Invalid" for inputs outside of the domain.


public class BasicLogarithm {
    public static Object logarithm(Object base, Object num) {
        if ((int)base <= Integer.MIN_VALUE || (int)num <= Integer.MIN_VALUE)
            return "Invalid";
        if ((int)base >= Integer.MAX_VALUE || (int)num >= Integer.MAX_VALUE)
            return "Invalid";
        if ((int)base <= 1 ||(int)num <= 0)
            return "Invalid";

        return (int)(Math.log((int)num) / Math.log((int)base));
    }
}
