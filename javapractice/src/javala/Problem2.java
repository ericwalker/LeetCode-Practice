package javala;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1, l2, 0);
    }
    public ListNode helper(ListNode l1, ListNode l2, int carry)
    {
        if (l1 == null && l2 == null && carry == 1)
            return new ListNode(1);
        else if (l1 == null && l2 == null && carry == 0)
            return null;

        // Initialize the node
        ListNode l1Next = null, l2Next = null; // <== KET POINT!!!
        int val1 = 0, val2 = 0;

        if (l1 != null)
        {
            val1 = l1.val;
            l1Next = l1.next; // <== KET POINT!!!
        }
        if (l2 != null)
        {
            val2 = l2.val;
            l2Next = l2.next; // <== KET POINT!!!
        }
        int sum = val1+val2+carry;

        ListNode childNode = new ListNode(sum%10);
        childNode.next = helper(l1Next, l2Next, sum/10); // <== KET POINT!!!

        return childNode;
    }
}