/**
 * Created by hanson on 2019/4/15
 *
 * @author Hanson
 * 2019/4/15
 * 766. Toeplitz Matrix
 * https://leetcode.com/problems/toeplitz-matrix/
 */
public class Solution_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int columnLength = matrix[0].length,
                rowLength = matrix.length;

        for (int i = 0; i < rowLength - 1; i++) {
            for (int j = 0; j < columnLength - 1; j++) {
                if (matrix[i][j]!=matrix[i+1][j+1])
                    return false;
            }
        }
        return true;
    }
}
