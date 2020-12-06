/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return buildBinaryTree (0, 0, inorder.length-1, preorder, inorder);
    }

public TreeNode buildBinaryTree (int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        // int preStart: the index of the root of preorder.
        // int inStart: 

        if (preStart > preorder.length-1 || inStart > inEnd)
            return null;
        
        TreeNode root = new TreeNode(preorder[preStart]);

        int inIndex = 0;
        for (int i=inStart; i<=inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }

        root.left = buildBinaryTree(preStart+1, inStart, inIndex-1, preorder, inorder);
        root.right = buildBinaryTree(preStart+inIndex-inStart+1 ,inIndex+1, inEnd, preorder, inorder); // <-- tricky: preStart+inIndex-inStart+1 

        return root;
    }
}
// @lc code=end

