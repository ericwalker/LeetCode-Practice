// Recursive solution
// 21. Merge Two Sorted Lists
package javala;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Problem21Sol2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode p = result;

        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        if (l1 != null || l2 != null)
        {
            if (l1.val <= l2.val)
            {
                result.val = l1.val;
                result.next = mergeTwoLists(l1.next,l2);
            }

            else if (l1.val > l2.val)
            {
                result.val = l2.val;
                result.next = mergeTwoLists(l1,l2.next);
            }
        }



        return result;
    }
}