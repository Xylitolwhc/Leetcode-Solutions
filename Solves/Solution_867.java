/**
 * Created by hanson on 2019/4/13
 *
 * @author Hanson
 * 2019/4/13
 * 867. Transpose Matrix
 * https://leetcode.com/problems/transpose-matrix/
 */
public class Solution_867 {
    public int[][] transpose(int[][] A) {
        int[][] transposeA = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                transposeA[j][i] = A[i][j];
            }
        }
        return transposeA;
    }
}
