import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hanson on 2019/4/14
 *
 * @author Hanson
 * 2019/4/14
 * 872. Leaf-Similar Trees
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class Solution_872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = getLeafValueSequence(root1),
                leaf2 = getLeafValueSequence(root2);
        if (leaf1.size() != leaf2.size())
            return false;
        for (int i = 0; i < leaf1.size(); i++) {
            if (leaf1.get(i) != leaf2.get(i))
                return false;
        }
        return true;
    }

    private List<Integer> getLeafValueSequence(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        addValue(values, root);
        return values;
    }

    private void addValue(List<Integer> list, TreeNode node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                list.add(node.val);
            } else {
                addValue(list, node.left);
                addValue(list, node.right);
            }
        }
    }
}
