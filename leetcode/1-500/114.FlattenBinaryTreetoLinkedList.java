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
    private TreeNode list = new TreeNode();
    public void flatten(TreeNode root) {
        pre(root);
    }
    
    public void pre(TreeNode root){
        if(root!=null){
            
            TreeNode left = root.left;
            TreeNode right = root.right;
            
            root.left = null;
            root.right = null;
            
            list.right = root;
            list = list.right;
            
            pre(left);
            pre(right);
        
        }
    }
}
//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
