/**
 * Created by Hanson on 2019/5/20
 *
 * @author Hanson
 * 2019/5/20
 * 1038. Binary Search Tree to Greater Sum Tree
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/
 */
public class Solution_1038 {
    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;
        addNode(root);
        return root;
    }

    private void addNode(TreeNode node) {
        if (node != null) {
            addNode(node.right);
            sum += node.val;
            node.val = sum;
            addNode(node.left);
        }
    }
}
