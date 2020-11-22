/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        
        // Use Stack
        Stack stack = new Stack();
        ListNode ptr = head;

        while (ptr != null) {
            stack.push(ptr.val);
            ptr = ptr.next;
        }
        
        while (head != null) {
            if (head.val != (int)stack.pop()) {
                return false;
            }

            head = head.next;
        }

        return true;
    }
}
// @lc code=end

