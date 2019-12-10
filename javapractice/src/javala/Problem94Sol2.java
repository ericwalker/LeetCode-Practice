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
class Problem94Sol2 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> resultArray = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode curNode = root;

        while (curNode != null || !stack.isEmpty())
        {
            while (curNode != null)
            {
                stack.push(curNode);
                curNode = curNode.left;
            }

            curNode = stack.pop();
            resultArray.add(curNode.val);

            curNode = curNode.right;
        }

        return resultArray;
    }
}