
/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Iteration method
        Stack<TreeNode> stack_p = new Stack<TreeNode>();
        Stack<TreeNode> stack_q = new Stack<TreeNode>();

        

        if (p != null) {
            stack_p.push(p);
        }

        if (q != null) {
            stack_q.push(q);
        }

        while (stack_p.size() > 0 && stack_q.size() > 0) {
            
            p = stack_p.pop();
            q = stack_q.pop();


            if (p.val != q.val) {
                return false;
            }

            if (p.left != null) {
                stack_p.push(p.left);
            }

            if (q.left != null) {
                stack_q.push(q.left);
            }

            // if one of p.left and q.left is null
            if (stack_p.size() != stack_q.size()) {
                return false;
            }

            if (p.right != null) {
                stack_p.push(p.right);
            }

            if (q.right != null) {
                stack_q.push(q.right);
            }

            // if one of p.right and q.right is null
            if (stack_p.size() != stack_q.size()) {
                return false;
            }

        }

        if (stack_p.size() == 0 && stack_q.size() == 0)
            return true;
        else
            return false;
    }
}
// @lc code=end

