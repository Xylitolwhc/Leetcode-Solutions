/**
 * Created by hanson on 2017/12/2.
 *
 * @author Hanson
 * 2017/12/2
 * 693. Binary Number with Alternating Bits
 * https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 */
public class Solution_693 {
    public boolean hasAlternatingBits(int n) {
        if (n == 1) return true;
        char[] c = Integer.toBinaryString(n).toCharArray();
        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] + c[i] != '0' + '1') return false;
        }
        return true;
    }
}
