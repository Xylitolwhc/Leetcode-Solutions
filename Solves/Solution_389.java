/**
 * Created by Hanson on 2019/4/27
 *
 * @author Hanson
 * 2019/4/27
 * 389. Find the Difference
 * https://leetcode.com/problems/find-the-difference/
 */
public class Solution_389 {
    public char findTheDifference(String s, String t) {
        long sum = 0;
        for (char c : s.toCharArray()) {
            sum += c;
        }
        for (char c : t.toCharArray()) {
            sum -= c;
        }
        return (char)Math.abs(sum);
    }
}
