/**
 * Created by hanson on 2017/11/30.
 *
 * @author Hanson
 * 2017/11/30
 * 647. Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/description/
 */
public class Solution_647 {
    int num = 0;
    int length;

    public int countSubstrings(String s) {
        length = s.length();
        for (int i = 0; i < length; i++) {
            palindromic(s, i, i);
            palindromic(s, i, i + 1);
        }
        return num;
    }

    void palindromic(String s, int left, int right) {
        while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            num++;
        }
    }
}
