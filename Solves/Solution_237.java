/**
 * Created by Hanson on 2019/4/27
 *
 * @author Hanson
 * 2019/4/27
 * 237. Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class Solution_237 {
    public void deleteNode(ListNode node) {
        //???????
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
