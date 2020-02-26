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
class Solution {

    // Iterative solution: use Stack
    public List<Integer> preorder(Node root) {
        List<Integer> resultList = new ArrayList<Integer>();

        if (root == null)
            return resultList;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty())
        {
            Node curRoot = stack.pop();
            resultList.add(curRoot.val);

            for (int i = curRoot.children.size()-1; i >= 0; i--)
                stack.push(curRoot.children.get(i));
        }

        return resultList;
    }
}