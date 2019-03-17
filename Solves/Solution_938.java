/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 938. Range Sum of BST
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class Solution_938 {
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

    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root.val >= L && root.val <= R) {
            sum = root.val;
        }
        if (root.left != null) {
            sum += rangeSumBST(root.left, L, R);
        }
        if (root.right != null) {
            sum += rangeSumBST(root.right, L, R);
        }
        return sum;
    }

}



