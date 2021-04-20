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
    public List<Integer> preorder(Node root) {
        List<Integer> preordered = new ArrayList<>();
        if(root!=null){
            ArrayDeque<Node> q = new ArrayDeque<>();
            q.offerFirst(root);
            Node n = null;
            while(!q.isEmpty()){
                n = q.pollFirst();
                preordered.add(n.val);
                if(n.children!=null && !n.children.isEmpty()){
                    for(int i = n.children.size()-1; i>=0 ;i--){
                        q.offerFirst(n.children.get(i));
                    }
                }
            }
        }
        return preordered;
    }
}
//https://leetcode.com/problems/n-ary-tree-preorder-traversal/
