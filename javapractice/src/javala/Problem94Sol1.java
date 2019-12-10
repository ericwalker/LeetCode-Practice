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
class Problem94Sol1 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> resultArray = new ArrayList<Integer>();

        if (root == null)
            return resultArray;

        helper(root, resultArray);

        return resultArray;
    }

    public void helper(TreeNode root, List<Integer> resultArray)
    {
        if (root.left != null)
            helper(root.left, resultArray);

        resultArray.add(root.val);

        if (root.right != null)
            helper(root.right, resultArray);
    }
}