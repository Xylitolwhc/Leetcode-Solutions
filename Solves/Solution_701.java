/**
 * Created by hanson on 2019/3/17
 *
 * @author Hanson
 * 2019/3/17
 * 701. Insert into a Binary Search Tree
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 */
public class Solution_701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        while (true) {
            if (val > node.val) {
                if (node.right != null) {
                    node = node.right;
                } else {
                    node.right = new TreeNode(val);
                    return root;
                }
            } else {
                if (node.left != null) {
                    node = node.left;
                } else {
                    node.left = new TreeNode(val);
                    return root;
                }
            }
        }
    }
}
