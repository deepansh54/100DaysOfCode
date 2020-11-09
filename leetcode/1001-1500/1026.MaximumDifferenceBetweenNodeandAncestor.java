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
    public int maxAncestorDiff(TreeNode root) {
        return findMaxDiff(root, new ArrayList<>());
    }
    private int findMaxDiff(TreeNode root, List<TreeNode> ancestors){
        if(root!=null){
            int maxDiff = -1;
            int diff = 0;
            for(TreeNode node : ancestors){
                diff = Math.abs(node.val - root.val); 
                if(diff>maxDiff){
                    maxDiff = diff;
                }
            }
            List<TreeNode> newAncestors = new ArrayList<>(ancestors);
            newAncestors.add(root);
            return Math.max(maxDiff, Math.max(findMaxDiff(root.left, newAncestors), findMaxDiff(root.right, newAncestors)));
        }
        return -1;
    }
}
//https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/