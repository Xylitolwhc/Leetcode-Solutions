/**
 * Created by hanson on 2017/11/29.
 *
 * @author Hanson
 * 2017/11/29
 * 521. Longest Uncommon Subsequence I
 * https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
 */
public class Solution_521 {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : (a.length() > b.length() ? a.length() : b.length());  //Serious?
    }
}
