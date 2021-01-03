//Given a binary tree, return the level order traversal of its nodes' values. (i
//e, from left to right, level by level). 
//
// 
//For example: 
//Given binary tree [3,9,20,null,null,15,7], 
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
// 
// 
//return its level order traversal as: 
// 
//[
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics Tree Breadth-first Search 
// 👍 3895 👎 95


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    public List<List<Integer>> levelOrder(TreeNode root) {

        // Use Queue and BFS to implement
        // Can search Breadth First Traversal Algo

        List<List<Integer>> resultList = new ArrayList<>();

        Queue<TreeNode> curQueue = new LinkedList<>();

        if (root != null) {
            curQueue.add(root);
        }

        while (!curQueue.isEmpty()) {

            Queue<TreeNode> nextQueue = new LinkedList<>();
            List<Integer> listOfSameHeight = new ArrayList<>();

            while (!curQueue.isEmpty()) {
                TreeNode newNode = curQueue.peek();
                if (newNode.left != null) {
                    nextQueue.add(newNode.left);
                }
                if (newNode.right != null) {
                    nextQueue.add(newNode.right);
                }
                listOfSameHeight.add(newNode.val);
                curQueue.remove();
            }
            resultList.add(listOfSameHeight);

            curQueue = nextQueue;
        }

        return resultList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
