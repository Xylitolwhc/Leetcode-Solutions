/**
 * Created by hanson on 2019/4/14
 *
 * @author Hanson
 * 2019/4/14
 * 806. Number of Lines To Write String
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 */
public class Solution_806 {
    public int[] numberOfLines(int[] widths, String S) {
        int units = 0, lines = 0;
        for (char c : S.toCharArray()) {
            int width = widths[c - 'a'];
            if (units + width > 100) {
                lines++;
                units = width;
            } else units += width;
        }
        return new int[]{lines + 1, units};
    }
}
