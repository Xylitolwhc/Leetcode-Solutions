import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/13
 *
 * @author Hanson
 * 2019/4/13
 * 821. Shortest Distance to a Character
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class Solution_821 {
    public int[] shortestToChar(String S, char C) {
        int[] distance = new int[S.length()];
        char[] charArray = S.toCharArray();
        List<Integer> cPos = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == C) {
                cPos.add(i);
            }
        }

        int first = cPos.get(0);
        for (int i = 0; i < first; i++) {
            distance[i] = first - i;
        }

        for (int i = 0; i < cPos.size() - 1; i++) {
            int left = cPos.get(i),
                    right = cPos.get(i + 1);
            for (int j = left + 1; j <= (left + right) / 2; j++) {
                distance[j] = j - left;
            }

            for (int j = (left + right) / 2 + 1; j <= right; j++) {
                distance[j] = right - j;
            }
        }

        int last = cPos.get(cPos.size() - 1);
        for (int i = last; i < distance.length; i++) {
            distance[i] = i - last;
        }

        return distance;
    }

    public static void main(String... args) {

        int[] s = new Solution_821().shortestToChar("loveleetcode", 'e');
        for (int i : s) System.out.print(i + "\t");
    }
}
