/**
 * Created by Hanson on 2019/4/29
 *
 * @author Hanson
 * 2019/4/29
 * 993. Cousins in Binary Tree
 * https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class Solution_993 {
    private TreeNode xNode, yNode;
    private int xDepth, yDepth;

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root.val == x || root.val == y) {
            return false;
        }
        findNode(root, x, y, 0);
        if (xNode != null && yNode != null) {
            if (xDepth == yDepth && xNode.val != yNode.val){
                return true;
            }
        }
        return false;
    }

    private void findNode(TreeNode node, int x, int y, int depth) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            if (node.left.val == x) {
                xNode = node;
                xDepth = depth;
                return;
            } else if (node.left.val == y) {
                yNode = node;
                yDepth = depth;
                return;
            } else {
                findNode(node.left, x, y, depth + 1);
            }
        }
        if (node.right != null) {
            if (node.right.val == x) {
                xNode = node;
                xDepth = depth;
                return;
            } else if (node.right.val == y) {
                yNode = node;
                yDepth = depth;
                return;
            } else {
                findNode(node.right, x, y, depth + 1);
            }
        }
    }
}
