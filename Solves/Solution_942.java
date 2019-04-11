import java.util.HashMap;

/**
 * Created by hanson on 2019/4/11
 *
 * @author Hanson
 * 2019/4/11
 * 942. DI String Match
 * https://leetcode.com/problems/di-string-match/
 */
public class Solution_942 {
    public int[] diStringMatch(String S) {
        int[] match = new int[S.length() + 1];
        int min = 0, max = 0;
        char[] array = S.toCharArray();
        match[0] = 0;
        for (int i = 0; i < S.length(); i++) {
            if (array[i] == 'I') {
                match[i + 1] = ++max ;
            } else if (array[i] == 'D') {
                match[i + 1] = --min ;
            }
        }
        if (min < 0) {
            for (int i = 0; i < S.length() + 1; i++) {
                match[i] -= min;
            }
        }
        return match;
    }
}
