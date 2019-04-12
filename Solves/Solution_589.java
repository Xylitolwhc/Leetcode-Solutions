import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 589. N-ary Tree Preorder Traversal
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 */
public class Solution_589 {
    private List<Integer> preorderList = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        recursion(root);
        return preorderList;
    }

    private void recursion(Node node) {
        if (node != null) {
            preorderList.add(node.val);
            if (node.children != null) {
                for (Node n : node.children) {
                    recursion(n);
                }
            }
        }
    }
}
