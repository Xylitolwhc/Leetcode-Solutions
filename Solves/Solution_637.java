import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by hanson on 2017/11/30.
 *
 * @author Hanson
 * 2017/11/30
 * 637. Average of Levels in Binary Tree
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 */
public class Solution_637 {
    ArrayList<Integer> num = new ArrayList<>();
    List<Double> list = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        count(root, 0);
        for (int i = 0; i < list.size(); i++) list.set(i, list.get(i) / num.get(i));
        return list;
    }

    void count(TreeNode node, int level) {
        if (num.size() <= level) num.add(level, 1);
        else num.set(level, num.get(level) + 1);
        if (list.size() <= level) list.add(level, Double.valueOf(node.val));
        else list.set(level, list.get(level) + node.val);

        if (node.left != null) count(node.left, level + 1);
        if (node.right != null) count(node.right, level + 1);
    }
}
