/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode root = new TreeNode();

        int len = nums.length;
        
        if (len == 0)
            return null;

        root = makeSubTree(nums, 0, len-1);    
        return root;
    }

    public TreeNode makeSubTree(int[] nums, int start, int end) {

        if (start > end)
            return null;

        else {
            TreeNode root = new TreeNode();
            int mid = start + (end-start)/2;
            root.val = nums[mid];
            root.left = makeSubTree(nums, start, mid-1);
            root.right = makeSubTree(nums, mid+1, end);
            
            return root;
        }
        
    }
}



// @lc code=end

