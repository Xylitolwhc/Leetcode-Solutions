import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 654. Maximum Binary Tree
 * https://leetcode.com/problems/maximum-binary-tree/
 */
public class Solution_654 {
    /*
     * Definition for a binary tree node.
     */
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int maxNum = Integer.MIN_VALUE, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum) {
                maxNum = nums[i];
                index = i;
            }
        }
        TreeNode node = new TreeNode(maxNum);
        if (index != 0) {
            node.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        }
        if (index != nums.length - 1) {
            node.right = constructMaximumBinaryTree(
                    Arrays.copyOfRange(nums, index + 1, nums.length)
            );
        }
        return node;
    }

    public static void main(String... args) {
        int[] nums = new int[]{3, 2, 1, 6, 0, 5};
        System.out.println(new Solution_654().constructMaximumBinaryTree(nums));
    }
}
