/**
 * Created by Hanson on 2019/4/19
 *
 * @author Hanson
 * 2019/4/19
 * 892. Surface Area of 3D Shapes
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 */
public class Solution_892 {
    public int surfaceArea(int[][] grid) {
        int sum = 0;
        int length = grid.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int height = grid[i][j];
                if (height != 0) {
                    sum += 2;//bottom & top

                    if (i == 0) {//i=0 side
                        sum += height;
                    } else if (grid[i - 1][j] < height) {
                        sum += height - grid[i - 1][j];
                    }

                    if (i == length - 1) {//i=+oo side
                        sum += height;
                    } else if (grid[i + 1][j] < height) {
                        sum += height - grid[i + 1][j];
                    }

                    if (j == 0) {//j=0 side
                        sum += height;
                    } else if (grid[i][j - 1] < height) {
                        sum += height - grid[i][j - 1];
                    }

                    if (j == length - 1) {//j=+oo side
                        sum += height;
                    } else if (grid[i][j + 1] < height) {
                        sum += height - grid[i][j + 1];
                    }
                }
            }
        }
        return sum;
    }
}
