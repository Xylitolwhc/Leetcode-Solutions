/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 13:28
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class Solution_461 {
    public int hammingDistance(int x, int y) {
        String x2 = Integer.toBinaryString(x), y2 = Integer.toBinaryString(y);
        int s = 0, l = Math.max(x2.length(), y2.length());
        while (x2.length() != y2.length()) {
            if (x2.length() < y2.length()) x2 = "0" + x2;
            else y2 = "0" + y2;
        }
        for (int d = 0; d < l; d++) {
            if (!x2.substring(d, d + 1).equals(y2.substring(d, d + 1))) s++;
        }
        return s;
    }
}
