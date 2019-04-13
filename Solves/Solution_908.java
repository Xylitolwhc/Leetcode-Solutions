/**
 * Created by hanson on 2019/4/13
 *
 * @author Hanson
 * 2019/4/13
 * 908. Smallest Range I
 * https://leetcode.com/problems/smallest-range-i/
 */
public class Solution_908 {
    public int smallestRangeI(int[] A, int K) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int a : A) {
            if (a > max) max = a;
            if (a < min) min = a;
        }

        return (max - K <= min + K) ? 0 : (max - K) - (min + K);
    }
}
