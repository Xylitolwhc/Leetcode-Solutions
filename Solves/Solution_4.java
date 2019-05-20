/**
 * Created by Hanson on 2019/5/20
 *
 * @author Hanson
 * 2019/5/20
 * 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class Solution_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0, index2 = 0;
        int[] nums = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums.length; i++) {
            if (index1 < nums1.length) {
                if (index2 >= nums2.length || nums1[index1] < nums2[index2]) {
                    nums[i] = nums1[index1++];
                    continue;
                }
            }
            nums[i] = nums2[index2++];
        }
        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        } else {
            return nums[(nums.length - 1) / 2];
        }
    }
}
