import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/14
 *
 * @author Hanson
 * 2019/4/14
 * 893. Groups of Special-Equivalent Strings
 * https://leetcode.com/problems/groups-of-special-equivalent-strings/
 */
public class Solution_893 {

    public int numSpecialEquivGroups(String[] A) {
        List<SpecialString> groups = new ArrayList<>();

        for (String a : A) {
            SpecialString specialString = new SpecialString();
            char[] chars = a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                specialString.addChar(chars[i], i);
            }
            boolean hasSame = false;
            for (SpecialString string : groups) {
                if (isSame(string, specialString)) {
                    hasSame = true;
                    break;
                }
            }
            if (!hasSame) {
                groups.add(specialString);
            }
        }
        return groups.size();
    }

    class SpecialString {
        public int[] groupsOdd = new int[26],
                groupsEven = new int[26];

        public void addChar(char c, int pos) {
            if (pos % 2 == 0) {
                groupsEven[c - 'a'] += 1;
            } else {
                groupsOdd[c - 'a'] += 1;
            }
        }
    }

    public static boolean isSame(SpecialString string1, SpecialString string2) {
        for (int i = 0; i < 26; i++) {
            if (string1.groupsEven[i] != string2.groupsEven[i]
                    || string1.groupsOdd[i] != string2.groupsOdd[i])
                return false;
        }
        return true;
    }
}
