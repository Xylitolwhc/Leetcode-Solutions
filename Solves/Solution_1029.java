import java.util.Arrays;

/**
 * Created by Hanson on 2019/4/27
 *
 * @author Hanson
 * 2019/4/27
 * 1029. Two City Scheduling
 * https://leetcode.com/problems/two-city-scheduling/
 */
public class Solution_1029 {
    public int twoCitySchedCost(int[][] costs) {
        for (int i = 0; i < costs.length; i++) {
            for (int j = costs.length - 1; j > i; j--) {
                if (costs[j][0] - costs[j][1] > costs[j - 1][0] - costs[j - 1][1]) {
                    int[] tmp = costs[j];
                    costs[j] = costs[j - 1];
                    costs[j - 1] = tmp;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            sum += costs[i][1];
        }
        for (int i = costs.length / 2; i < costs.length; i++) {
            sum += costs[i][0];
        }
        return sum;
    }
}
