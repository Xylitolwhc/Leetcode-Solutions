import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2017/11/30.
 *
 * @author Hanson
 * 2017/11/30
 * 515. Find Largest Value in Each Tree Row
 * https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
 */
public class Solution_515 {
    List<Integer> list = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        if (root == null) return list;
        count(root, 0);
        return list;
    }

    void count(TreeNode node, int level) {
        if (list.size() <= level) list.add(level, node.val);
        else if (list.get(level) < node.val) {
            list.set(level, node.val);
        }

        if (node.left != null) count(node.left, level + 1);
        if (node.right != null) count(node.right, level + 1);
    }
}
