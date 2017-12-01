import java.util.Arrays;

/**
 * Created by hanson on 2017/12/1.
 *
 * @author Hanson
 * 2017/12/1
 * 413. Arithmetic Slices
 * https://leetcode.com/problems/arithmetic-slices/description/
 */
public class Solution_413 {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 2; j < A.length; j++) {
                if (A[j - 1] - A[j - 2] != A[j] - A[j - 1]) {
                    count += num(j - i);
                    i = j - 2;
                    break;
                } else if (j == A.length - 1) {
                    count += num(j - i + 1);
                    return count;
                }
            }
        }
        return count;
    }

    int num(int m) {
        int n = 0;
        for (int k = 3; k <= m; k++) {
            n += m - k + 1;
        }
        return n;
    }
}
