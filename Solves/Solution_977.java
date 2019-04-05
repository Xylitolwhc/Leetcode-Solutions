import java.util.Arrays;

/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 * 977. Squares of a Sorted Array
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class Solution_977 {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] *= A[i];
            for (int j = i; j > 0; j--) {
                if (A[j] < A[j - 1]) {
                    int tmp = A[j];
                    A[j] = A[j - 1];
                    A[j - 1] = tmp;
                } else {
                    break;
                }
            }
        }
        return A;
    }

/*
    public int[] sortedSquares(int[] A) {
        for(int i = 0; i<A.length; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A, 0, A.length);
        return A;
    }
*/

}
