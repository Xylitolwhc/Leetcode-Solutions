/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 965. Univalued Binary Tree
 * https://leetcode.com/problems/univalued-binary-tree/
 */
public class Solution_965 {
    public boolean isUnivalTree(TreeNode root) {
        return isSameVal(root, root.val);
    }

    private boolean isSameVal(TreeNode node, int val) {
        if (node == null) return true;
        return node.val == val && isSameVal(node.left, val) && isSameVal(node.right, val);
    }
}
