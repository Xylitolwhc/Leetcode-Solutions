/**
 * Created by hanson on 2017/11/29.
 *
 * @author Hanson
 * 2017/11/29
 * 496. Next Greater Element I
 * https://leetcode.com/problems/next-greater-element-i/description/
 */
public class Solution_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int num = 0; num < nums1.length; num++) {
            nums1[num] = postion(nums2, nums1[num]);
        }
        return nums1;
    }

    int postion(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] > num)
                        return nums[j];
                }
            }
        }
        return -1;
    }
}
