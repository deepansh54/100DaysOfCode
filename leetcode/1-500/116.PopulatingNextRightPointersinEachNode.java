/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root!=null){
            populate(root.left, root.right, false);
        }        
        return root;
    }
    private void populate(Node left, Node right, boolean skip){
        
        if(left!=null){
            left.next = right;
            if(!skip){
                populate(left.left, left.right, false);
                populate(right.left, right.right, false);  
            }
            populate(left.right, right.left, true);
        }
        
    }
}
//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/