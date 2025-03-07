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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        return isValidBST(root.left, null, root.val) && isValidBST(root.right, root.val, null);
    }
    public boolean isValidBST(TreeNode root, Integer minVal, Integer maxVal){
        if(root == null){
            return true;
        }
        if(maxVal!=null && root.val >= maxVal){
            return false;
        }
        if(minVal!=null && root.val<=minVal){
            return false;
        }
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
//https://leetcode.com/problems/validate-binary-search-tree/