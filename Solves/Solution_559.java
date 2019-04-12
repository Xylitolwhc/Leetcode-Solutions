/**
 * Created by hanson on 2019/4/12
 *
 * @author Hanson
 * 2019/4/12
 * 559. Maximum Depth of N-ary Tree
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class Solution_559 {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node node : root.children) {
            int depth = maxDepth(node);
            if (depth > max) max = depth;
        }
        return max + 1;
    }
}
