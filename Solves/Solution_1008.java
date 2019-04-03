/**
 * Created by hanson on 2019/4/3
 *
 * @author Hanson
 * 2019/4/3
 */
public class Solution_1008 {
    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null) return null;
        return createTreeNode(preorder, 0, preorder.length - 1);
    }

    private TreeNode createTreeNode(int[] preorder, int start, int end) {
        if (start > end) return null;
        TreeNode node = new TreeNode(preorder[start]);
        int i = start + 1;
        for (; i <= end; i++) {
            if (preorder[i] > node.val) {
                break;
            }
        }
        node.left = createTreeNode(preorder, start + 1, i - 1);
        node.right = createTreeNode(preorder, i, end);
        return node;
    }

    public static void main(String... a) {
        Solution_1008 s = new Solution_1008();
        int n[] = {4, 2};
        s.bstFromPreorder(n);
    }
}
