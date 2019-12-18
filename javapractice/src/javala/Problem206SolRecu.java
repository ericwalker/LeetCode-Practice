package javala;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem206SolRecu {
    public ListNode reverseList(ListNode head) {

        if (head == null)
            return null;

        ListNode result = new ListNode(head.val);
        ListNode cur = head;

        return helper(cur, result);
    }

    public ListNode helper(ListNode cur, ListNode result)
    {
        if (cur.next != null)
        {
            ListNode newNode = new ListNode(cur.next.val);
            newNode.next = result;
            result = newNode;
            cur = cur.next;

            return helper (cur, result);
        }
        return result;
    }
}