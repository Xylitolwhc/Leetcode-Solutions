/**
 * Created by hanson on 2019/4/11
 *
 * @author Hanson
 * 2019/4/11
 * 1021. Remove Outermost Parentheses
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class Solution_1021 {
    public String removeOuterParentheses(String S) {
        StringBuilder removedStr = new StringBuilder();
        int outer = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                if (outer != 0) {
                    removedStr.append(c);
                }
                outer += 1;
            } else if (c == ')') {
                if (outer != 1) {
                    removedStr.append(c);
                }
                outer -= 1;
            }
        }
        return removedStr.toString();
    }
}
