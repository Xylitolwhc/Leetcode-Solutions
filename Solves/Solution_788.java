import java.util.HashMap;
import java.util.Set;

/**
 * Created by Hanson on 2019/4/26
 *
 * @author Hanson
 * 2019/4/26
 * 788. Rotated Digits
 * https://leetcode.com/problems/rotated-digits/
 */
public class Solution_788 {
    private static HashMap<Integer, Integer> rotateMap = new HashMap<>();

    public int rotatedDigits(int N) {
        int count = 0;
        rotateMap.put(0, 0);
        rotateMap.put(1, 1);
        rotateMap.put(2, 5);
        rotateMap.put(5, 1);
        rotateMap.put(6, 9);
        rotateMap.put(8, 8);
        rotateMap.put(9, 6);
        for (int i = 1; i <= N; i++) {
            int rotatedNum = rotate(i);
            if (rotatedNum != -1 && rotatedNum != i) {
                count++;
            }
        }
        return count;
    }

    private int rotate(int num) {
        int rotated = 0;
        int pos = 1;
        while (num / pos > 0) {
            int digit = (num / pos) % 10;
            if (rotateMap.containsKey(digit)) {
                rotated += rotateMap.get(digit) * pos;
            } else {
                return -1;
            }
            pos *= 10;
        }
        return rotated;
    }
}
