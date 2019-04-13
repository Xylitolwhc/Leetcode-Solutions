/**
 * Created by hanson on 2019/4/13
 *
 * @author Hanson
 * 2019/4/13
 * 876. Middle of the Linked List
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class Solution_876 {
    public ListNode middleNode(ListNode head) {
        ListNode doubleSpeed = head;
        while ((doubleSpeed = doubleSpeed.next) != null) {
            head = head.next;
            if ((doubleSpeed = doubleSpeed.next) == null) break;
        }
        return head;
    }
}
