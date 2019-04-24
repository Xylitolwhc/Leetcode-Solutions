/**
 * Created by Hanson on 2019/4/24
 *
 * @author Hanson
 * 2019/4/24
 * 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class Solution_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode node = head, prev = null, next;
        while (true) {
            next = node.next;
            node.next = prev;
            if (next != null) {
                prev = node;
                node = next;
            } else {
                return node;
            }
        }
    }
}
