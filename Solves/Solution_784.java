import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hanson on 2019/4/17
 *
 * @author Hanson
 * 2019/4/17
 * 784. Letter Case Permutation
 * https://leetcode.com/problems/letter-case-permutation/
 */
public class Solution_784 {
    public List<String> letterCasePermutation(String S) {
        List<String> words = new ArrayList<>();
        if (S.length() == 0) {
            words.add("");
            return words;
        }
        char c = S.charAt(0);
        if (Character.isLetter(c)) {
            for (String s : letterCasePermutation(S.substring(1))) {
                words.add(Character.toLowerCase(c) + s);
                words.add(Character.toUpperCase(c) + s);
            }
        } else {
            for (String s : letterCasePermutation(S.substring(1))) {
                words.add(c + s);
            }
        }
        return words;
    }
}
