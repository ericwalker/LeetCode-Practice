/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curPtr = head;
        
        while (curPtr != null)
        {
            if (curPtr.next == null)
            {
                break;
            }
            if (curPtr.val == curPtr.next.val)
            {
                curPtr.next = curPtr.next.next;
            }
            else
            {
                curPtr = curPtr.next;    
            }
        }
        
        return head;

    }
}
// @lc code=end

