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

// Recursive solution
class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> resultList = new ArrayList<Integer>();

        if (root == null)
            return resultList;

        resultList.add (root.val);

        for (Node ele : root.children)
            helper(resultList, ele);

        return resultList;
    }

    public List<Integer> helper (List<Integer> list, Node newNode)
    {
        list.add (newNode.val);

        for (Node ele : newNode.children)
            helper(list, ele);

        return list;
    }
}