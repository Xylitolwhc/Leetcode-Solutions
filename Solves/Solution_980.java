/**
 * Created by hanson on 2019/4/5
 *
 * @author Hanson
 * 2019/4/5
 * 980. Unique Paths III
 * https://leetcode.com/problems/unique-paths-iii/
 */
public class Solution_980 {
    private int[][] grid;

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) return calc(i, j);
            }
        }
        return 0;
    }

    private static int calc(int x, int y) {
        // TODO
        return 0;
    }
}
