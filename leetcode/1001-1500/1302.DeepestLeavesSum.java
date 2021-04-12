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
    private int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int d = depth(root);
        deep(root,d,0);
        return sum;
    }
    public int depth(TreeNode root){
        if(root!=null){
            return Math.max(depth(root.left)+1, depth(root.right)+1);
        }
        return 0;
    }
    public void deep(TreeNode root, int d, int cd){
        if(root!=null){
            if(cd+1==d){
                sum+=root.val;
            }
            deep(root.left,d,cd+1);
            deep(root.right,d,cd+1);
        }
    }
}
//https://leetcode.com/problems/deepest-leaves-sum/
