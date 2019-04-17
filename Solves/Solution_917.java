/**
 * Created by Hanson on 2019/4/17
 *
 * @author Hanson
 * 2019/4/17
 * 917. Reverse Only Letters
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class Solution_917 {
    public String reverseOnlyLetters(String S) {
        char[] reversed = S.toCharArray();
        int forward = 0, backward = S.length() - 1;
        while (forward < backward) {
            if (!Character.isLetter(reversed[forward])) {
                forward++;
                continue;
            }
            if (!Character.isLetter(reversed[backward])) {
                backward--;
                continue;
            }
            char tmp = reversed[forward];
            reversed[forward] = reversed[backward];
            reversed[backward] = tmp;
            forward++;
            backward--;
        }
        return String.valueOf(reversed);
    }
}
