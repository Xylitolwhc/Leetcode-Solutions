/**
 * Created by Hanson on 2019/4/21
 *
 * @author Hanson
 * 2019/4/21
 * 896. Monotonic Array
 * https://leetcode.com/problems/monotonic-array/
 */
public class Solution_896 {
    public boolean isMonotonic(int[] A) {
        if (A.length <= 2) return true;
        return increasing(A) || decreasing(A);
    }

    private boolean increasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1])
                return false;
        }
        return true;
    }

    private boolean decreasing(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1])
                return false;
        }
        return true;
    }
}
