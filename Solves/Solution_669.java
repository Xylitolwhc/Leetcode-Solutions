/**
 * Created by hanson on 2017/11/29.
 *
 * @author Hanson
 * 2017/11/29 10:06
 * 669. Trim a Binary Search Tree
 * https://leetcode.com/problems/trim-a-binary-search-tree/description/
 */

class Solution_669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        root.left = root.left != null ? trimBST(root.left, L, R) : null;
        root.right = root.right != null ? trimBST(root.right, L, R) : null;

        if (root.val >= L && root.val <= R) {
            return root;
        } else if (root.left == null && root.right == null) {
            return null;
        } else if (root.left != null) {
            return root.left;
        } else {
            return root.right;
        }
    }
}

