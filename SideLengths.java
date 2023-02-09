//Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. Return the longest side and medium-length side in that order.
//
//        Examples
//        otherSides(1) ➞ [2.0, 1.73]
//
//        otherSides(12) ➞ [24.0, 20.0]
//
//        otherSides(2) ➞ [4.0, 3.46]
//
//        otherSides(3) ➞ [6.0, 5.2]


public class SideLengths {
    public static double[] otherSides(int n) {
        return new double[]{(2.0 * n), (Math.sqrt(3.0) * n)};
    }
}