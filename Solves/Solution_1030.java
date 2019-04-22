import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Hanson on 2019/4/22
 *
 * @author Hanson
 * 2019/4/22
 * 1030. Matrix Cells in Distance Order
 * https://leetcode.com/problems/matrix-cells-in-distance-order/
 */
public class Solution_1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] matrix = new int[R * C][2];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i * R + j][0] = i;
                matrix[i * R + j][1] = j;
            }
        }
        Arrays.sort(matrix, Comparator.comparingInt(a -> (Math.abs(a[0] - r0) + Math.abs(a[1] - c0)))
        );
        return matrix;
    }
}
