// 21. Merge Two Sorted Lists
// Iterative solution
package javala;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem21Sol1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode pt = result;

        while(l1 != null || l2 != null)
        {
            if (l1 == null)
            {
                pt.next = l2;
                return result.next;
            }
            else if (l2 == null)
            {
                pt.next = l1;
                return result.next;
            }

            else if (l1.val <= l2.val)
            {
                ListNode newNode = new ListNode(l1.val);
                pt.next = newNode;
                pt = pt.next;
                l1 = l1.next;
            }
            else if (l1.val > l2.val)
            {
                ListNode newNode = new ListNode(l2.val);
                pt.next = newNode;
                pt = pt.next;
                l2 = l2.next;
            }
        }

        return result.next;
    }
}