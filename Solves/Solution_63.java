/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 */
public class Solution_63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int height = obstacleGrid.length;
        int width = obstacleGrid[0].length;
        int[][] path = new int[height][width];

        if (obstacleGrid[0][0] == 1)
            path[0][0] = 0;
        else
            path[0][0] = 1;

        for (int i = 1; i < width; i++) {
            if (obstacleGrid[0][i] == 1)
                path[0][i] = 0;
            else
                path[0][i] = path[0][i - 1];
        }

        for (int i = 1; i < height; i++) {
            if (obstacleGrid[i][0] == 1)
                path[i][0] = 0;
            else
                path[i][0] = path[i - 1][0];
        }

        for (int i = 1; i < height; i++) {
            for (int j = 1; j < width; j++) {
                if (obstacleGrid[i][j] == 1) {
                    path[i][j] = 0;
                } else {
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
                }
            }
        }
        return path[height - 1][width - 1];
    }
}
