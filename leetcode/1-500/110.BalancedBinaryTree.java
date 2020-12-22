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
    
    Boolean balanced  = true;
    
    public boolean isBalanced(TreeNode root) {
        checkHeight(root);
        return balanced;
    }
    
    private int checkHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = checkHeight(root.left);
        int right = checkHeight(root.right);
        if(Math.abs(left-right)>1){
            balanced = false;
        }
        return Math.max(left,right)+1;
    }
    
}
//https://leetcode.com/problems/balanced-binary-tree/