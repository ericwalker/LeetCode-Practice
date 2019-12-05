//Leetcode 105 - Construct Binary Tree from Preorder and Inorder Traversal.java

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
class Problem105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder == null || inorder == null)
            return null;

        HashMap <Integer, Integer> map = new HashMap();
        for (int i=0;i<inorder.length;i++)
            map.put(inorder[i],i); // <-- KEY POINT!!!
        // (9,0),(3,1),(15,2),(20,3),(7,4)

        return helper(map, preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    public TreeNode helper (HashMap<Integer,Integer>map, int[] preorder, int preStart, int preEnd,
                            int[] inorder, int inStart, int inEnd)
    {
        if (preStart > preEnd || inStart > inEnd)
            return null;


        int index = map.get(preorder[preStart]); // preorder[preStart] = 3, index = 1 // <-- KEY POINT!!!
        TreeNode root = new TreeNode(preorder[preStart]); // <-- KEY POINT!!!
        root.left = helper(map, preorder, preStart+1, preStart+(index-inStart),inorder,inStart,index-1);
        root.right = helper(map, preorder, preStart+(index-inStart)+1, preorder.length-1, inorder, index+1, inEnd);

        return root;
    }
}