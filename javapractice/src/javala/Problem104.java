// 104. Maximum Depth of Binary Tree

package javala;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Problem104 {
    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        return helper(root);

        // simplest solution
        // return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    public int helper(TreeNode tr)
    {
        if (tr.left == null && tr.right == null)
            return 1;
        else if (tr.left == null)
        {
            return 1 + helper(tr.right);
        }
        else if (tr.right == null)
        {
            return 1 + helper(tr.left);
        }
        else
        {
            return 1 + Math.max(helper(tr.left),helper(tr.right));
        }
    }
}