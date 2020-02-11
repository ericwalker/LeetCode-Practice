/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Use two pointers to solve it
public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode pt1 = head;
        ListNode pt2 = head.next;

        while(pt1 != null && pt2 != null)
        {
            if (pt1 == pt2)
                return true;

            pt1 = pt1.next;

            if (pt2.next != null)
                pt2 = pt2.next.next;
            else
                return false;
        }
        return false;
    }
}