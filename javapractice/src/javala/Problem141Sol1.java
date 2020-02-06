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
public class Solution {
    public boolean hasCycle(ListNode head) {


        if (head == null)
            return false;

        Set<ListNode> listSet = new HashSet<>(); // <== Hash table is able to save ListNode!!

        while(head.next != null)
        {
            if (listSet.contains(head))
                return true;
            else
            {
                listSet.add(head);
                head = head.next;
            }
        }

        return false;
    }
}