/**
 * Created by hanson on 2017/11/25.
 *
 * @author Hanson
 * 2017/11/25 15:44
 * 557. Reverse Words in a String III
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 */
public class Solution_557 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String rs = "";
        for (String word : words) {
            rs += new StringBuilder(word).reverse().toString() + " ";
        }
        return rs.trim();
    }
}
