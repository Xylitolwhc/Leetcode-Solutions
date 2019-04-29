import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hanson on 2019/4/29
 *
 * @author Hanson
 * 2019/4/29
 * 653. Two Sum IV - Input is a BST
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 */
public class Solution_653 {
    private List<Integer> nums = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        add(root);
        if (nums.size() < 2) return false;
        int left = 0, right = nums.size() - 1;
        while (left != right) {
            if (nums.get(left) + nums.get(right) > k) {
                right--;
            } else if (nums.get(left) + nums.get(right) < k) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }

    private void add(TreeNode node) {
        if (node == null) {
            return;
        }
        add(node.left);
        nums.add(node.val);
        add(node.right);
    }
}
