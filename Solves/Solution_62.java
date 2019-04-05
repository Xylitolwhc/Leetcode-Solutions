/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/
 */
public class Solution_62 {
    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        path[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) path[i][j] = 1;
                else path[i][j] = path[i - 1][j] + path[i][j - 1];
            }
        }
        return path[m - 1][n - 1];
    }
}
