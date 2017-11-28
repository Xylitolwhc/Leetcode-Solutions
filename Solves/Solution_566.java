/**
 * Created by hanson on 2017/11/28.
 *
 * @author Hanson
 * 2017/11/28 13:09
 * 566. Reshape the Matrix
 * https://leetcode.com/problems/reshape-the-matrix/description/
 */
public class Solution_566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] reShaped;
        int x = 0;
        int y = 0;
        if (nums.length * nums[0].length < r * c) {
            return nums;
        } else {
            reShaped = new int[r][c];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    reShaped[x][y] = nums[i][j];
                    y++;
                    if (y == c) {
                        x++;
                        y = 0;
                    }
                }
            }
            return reShaped;
        }
    }
}
