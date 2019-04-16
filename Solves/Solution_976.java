import java.util.Arrays;

/**
 * Created by hanson on 2019/4/16
 *
 * @author Hanson
 * 2019/4/16
 * 976. Largest Perimeter Triangle
 * https://leetcode.com/problems/largest-perimeter-triangle/
 */
public class Solution_976 {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; i--) {
            if (A[i] - A[i - 1] < A[i - 2]) {
                return A[i] + A[i - 1] + A[i - 2];
            }
        }
        return 0;
    }
}
