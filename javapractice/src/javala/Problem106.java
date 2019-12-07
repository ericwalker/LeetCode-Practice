// 106. Construct Binary Tree from Inorder and Postorder Traversal

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

public class Problem106 {
    public TreeNode buildTree(int[] inorder, int[] postorder)
    {
        if (inorder == null || postorder == null)
        {
            return null;
        }

        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        for(int i = 0; i < inorder.length;i++)
        {
            map.put(inorder[i], i);
            // (9,0),(3,1),(15,2),(20,3),(7,4)
        }

        // TreeNode root = new TreeNode();
        return helper(map, inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }

    public TreeNode helper(HashMap <Integer, Integer> map, int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd)
    {

        if (inEnd < inStart || postEnd < postStart)
            return null;

        int index = map.get(postorder[postEnd]); // index = 1

        TreeNode root = new TreeNode(postorder[postEnd]);
        // root = ;
        root.left = helper(map,inorder,inStart, index-1, postorder,postStart, postStart+index-inStart-1);
        root.right = helper(map,inorder, index+1, inEnd, postorder, postStart+index-inStart, postEnd-1);

        return root;
    }
}
