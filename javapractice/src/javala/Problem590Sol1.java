/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
// Recursive
class Solution {

    List<Integer> resultList = new LinkedList<Integer>();
    public List<Integer> postorder(Node root) {

        if (root == null)
            return resultList;

        if (root.children != null)
        {
            for (Node child : root.children)
            {
                postorder(child);
            }
        }

        resultList.add(root.val);

        return resultList;
    }
}