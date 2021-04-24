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
    int good = 0;
    public int goodNodes(TreeNode root) {
        goodNodes(root, -100000);
        return good;
    }
    public void goodNodes(TreeNode root, int max) {
        if(root!=null){
            if(max<=root.val){
                max = root.val;
                good++;  
            }
            
            goodNodes(root.left, max);
            goodNodes(root.right, max); 
        }
    }
}
//https://leetcode.com/problems/count-good-nodes-in-binary-tree/
