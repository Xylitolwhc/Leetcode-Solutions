/**
 * Created by hanson on 2019/4/15
 *
 * @author Hanson
 * 2019/4/15
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution_104 {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        } else {
            return 0;
        }
    }
}
