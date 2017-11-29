/**
 * Created by hanson on 2017/11/29.
 *
 * @author Hanson
 * 2017/11/29
 * 540. Single Element in a Sorted Array
 * https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 */
public class Solution_540 {
    public int singleNonDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i = i + 2) {
            if (i == nums.length - 1) return nums[i];
            if (nums[i] != nums[i + 1]) return nums[i];
        }
        return 0;
    }
}
