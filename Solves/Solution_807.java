/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 807. Max Increase to Keep City Skyline
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 */
public class Solution_807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] top = new int[grid[0].length],           //int[] default value{0,0,0,0...}
                left = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {     //find the max height of buildings viewed from top and left
            for (int j = 0; j < grid[0].length; j++) {
                int height = grid[i][j];
                if (height > top[j]) {
                    top[j] = height;
                }
                if (height > left[i]) {
                    left[i] = height;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {     //find the max height of buildings viewed from top and left
            for (int j = 0; j < grid[0].length; j++) {
                int height = grid[i][j];
                if (left[i] > top[j]) {
                    sum += top[j] - height;
                } else {
                    sum += left[i] - height;
                }
            }
        }
        return sum;
    }

    public static void main(String... a) {
        int[][] grid = new int[][]{
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}};

        System.out.print(new Solution_807().maxIncreaseKeepingSkyline(grid));
    }
}
