/**
 * Created by hanson on 2017/11/29.
 *
 * @author Hanson
 * 2017/11/29
 * 513. Find Bottom Left Tree Value
 * https://leetcode.com/problems/find-bottom-left-tree-value/description/
 */
public class Solution_513 {
    int val = Integer.MIN_VALUE, deepest = 0;

    public int findBottomLeftValue(TreeNode root) {
        deepLeft(root, 1);
        return val;
    }

    void deepLeft(TreeNode node, int depth) {
        if (deepest < depth) {
            val = node.val;
            deepest = depth;
        }
        if (node.left != null) deepLeft(node.left, depth + 1);
        if (node.right != null) deepLeft(node.right, depth + 1);
    }
}
