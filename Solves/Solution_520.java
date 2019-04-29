/**
 * Created by Hanson on 2019/4/29
 *
 * @author Hanson
 * 2019/4/29
 * 520. Detect Capital
 * https://leetcode.com/problems/detect-capital/
 */
public class Solution_520 {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;

        char[] letters = word.toCharArray();
        int kind = -1;
        if (Character.isLowerCase(letters[0])) {
            for (int i = 1; i < letters.length; i++) {
                if (!Character.isLowerCase(letters[i])) {
                    return false;
                }
            }
            return true;
        } else {
            if (Character.isLowerCase(letters[1])) {
                for (int i = 2; i < letters.length; i++) {
                    if (!Character.isLowerCase(letters[i])) {
                        return false;
                    }
                }
                return true;
            } else {
                for (int i = 2; i < letters.length; i++) {
                    if (Character.isLowerCase(letters[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
