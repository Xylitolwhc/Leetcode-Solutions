/**
 * Created by hanson on 2017/11/30.
 *
 * @author Hanson
 * 2017/11/30
 * 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 */
public class Solution_136 {
    public int singleNumber(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s ^= nums[i];
        }
        return s;
    }
}
