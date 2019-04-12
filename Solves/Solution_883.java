/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 883. Projection Area of 3D Shapes
 * https://leetcode.com/problems/projection-area-of-3d-shapes/
 */
public class Solution_883 {
    public int projectionArea(int[][] grid) {
        int sum = 0;
        int axisX = grid.length,
                axisY = grid[0].length;

        int[] topX = new int[axisX],
                topY = new int[axisY];

        for (int i = 0; i < axisX; i++) {
            for (int j = 0; j < axisY; j++) {
                int height = grid[i][j];
                if (height > 0) {
                    sum++;
                    if (height > topX[i]) {
                        topX[i] = height;
                    }
                    if (height > topY[j]) {
                        topY[j] = height;
                    }
                }
            }
        }

        for (int i = 0; i < axisX; i++) {
            sum += topX[i];
        }
        for (int i = 0; i < axisY; i++) {
            sum += topY[i];
        }
        return sum;
    }
}
