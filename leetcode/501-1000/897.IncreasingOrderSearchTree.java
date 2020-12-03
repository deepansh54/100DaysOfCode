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
    public TreeNode increasingBST(TreeNode root) {
        if(root!=null){
            TreeNode leftMost = root;
            while(leftMost.left!=null){
                leftMost=leftMost.left;
            }
            TreeNode left = makeIncreasingLeftBST(root.left);
            TreeNode right = increasingBST(root.right);
            if(left!=null){
                left.right = root;
                root.left = null;
            }
            if(right!=null){
                root.right = right;
            }
            return leftMost;
        }
        return null;
    }
    public TreeNode makeIncreasingLeftBST(TreeNode root){
        if(root!=null){
            TreeNode leftNode = makeIncreasingLeftBST(root.left);
            if(leftNode!=null){
                leftNode.right = root;
            }
            root.left = null;
            TreeNode rightNode = increasingBST(root.right);
            root.right = rightNode;
            TreeNode rightMost = root;
            while(rightMost.right!=null){
                rightMost = rightMost.right;
            }
            return rightMost;
        }
        return null;
    }
}
//https://leetcode.com/problems/increasing-order-search-tree/