/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 13:33
 * 463. Island Perimeter
 * https://leetcode.com/problems/island-perimeter/description/
 */
public class Solution_463 {
    public int islandPerimeter(int[][] grid) {
        int s = 0, l = grid.length, l1 = grid[0].length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l1; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0) s++;
                    else s = s + 1 - grid[i - 1][j];
                    if (i == l - 1) s++;
                    else s = s + 1 - grid[i + 1][j];
                    if (j == 0) s++;
                    else s = s + 1 - grid[i][j - 1];
                    if (j == l1 - 1) s++;
                    else s = s + 1 - grid[i][j + 1];
                }
            }
        }
        return s;
    }
}
