import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/16
 *
 * @author Hanson
 * 2019/4/16
 * 429. N-ary Tree Level Order Traversal
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 */
public class Solution_429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelOrder = new ArrayList<>();
        order(levelOrder, root, 0);
        return levelOrder;
    }

    private void order(List<List<Integer>> levelOrder, Node root, int depth) {
        if (root != null) {
            if (levelOrder.size() <= depth) {
                levelOrder.add(new ArrayList<>());
            }
            levelOrder.get(depth).add(root.val);
            for (Node child : root.children) {
                order(levelOrder, child, depth + 1);
            }
        }
    }
}
