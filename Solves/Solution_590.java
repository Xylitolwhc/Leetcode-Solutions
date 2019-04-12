import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 590. N-ary Tree Postorder Traversal
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 */
public class Solution_590 {
    private List<Integer> postorderList = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        recursion(root);
        return postorderList;
    }

    private void recursion(Node node) {
        if (node != null) {
            if (node.children != null) {
                for (Node n : node.children) {
                    recursion(n);
                }
            }
            postorderList.add(node.val);
        }
    }
}
