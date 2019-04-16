/**
 * Created by hanson on 2019/4/16
 *
 * @author Hanson
 * 2019/4/16
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class Solution_226 {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
