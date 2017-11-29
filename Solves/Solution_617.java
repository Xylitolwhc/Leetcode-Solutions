/**
 * Created by hanson on 2017/11/19.
 *
 * @author Hanson
 * 2017/11/19 16:18
 * 617. Merge Two Binary Trees
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 */

class Solution_617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t3 = new TreeNode(0);
        t3.val = 0;
        if (t1 != null) {
            t3.val += t1.val;
        }
        if (t2 != null) {
            t3.val += t2.val;
        }
        if (t1 == null && t2 == null) return null;
        t3.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        t3.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return t3;
    }
}