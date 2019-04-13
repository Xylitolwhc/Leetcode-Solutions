/**
 * Created by hanson on 2019/4/13
 *
 * @author Hanson
 * 2019/4/13
 * 897. Increasing Order Search Tree
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class Solution_897 {

    TreeNode pointer;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = new TreeNode(0);
        pointer = newRoot;
        ergodic(root);
        return newRoot.right;
    }

    private void ergodic(TreeNode node) {
        if (node != null) {
            ergodic(node.left);
            addNode(node);
            ergodic(node.right);
        }
    }


    private void addNode(TreeNode node) {
        pointer.right = new TreeNode(node.val);
        pointer = pointer.right;
    }
}
