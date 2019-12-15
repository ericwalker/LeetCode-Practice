package javala;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem206SolIter {
    public ListNode reverseList(ListNode head) {

        if (head == null)
            return null;

        ListNode result = new ListNode(head.val);
        ListNode cur = head;

        return reverseList(ListNode head.next);
    }
}