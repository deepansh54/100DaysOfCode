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
        TreeNode leftMost = root;
        while(leftMost.left!=null){
            leftMost=leftMost.left;
        }
        TreeNode t = makeIncreasingBST(root.left);
        TreeNode t2 = makeIncreasingBSTRight(root.right);
        if(t!=null){
            t.right=root;
            root.left=null;
        }
        if(t2!=null){
            root.right = t2;
        }
        return leftMost;
    }
    public TreeNode makeIncreasingBST(TreeNode root){
        if(root!=null){
            TreeNode leftNode = makeIncreasingBST(root.left);
            if(leftNode!=null){
                leftNode.right = root;
            }
            root.left = null;
            TreeNode rightNode = makeIncreasingBSTRight(root.right);
            if(rightNode!=null){   
                while(rightNode.right!=null){
                    rightNode = rightNode.right;
                }
            }
            return rightNode!=null?rightNode:root;
        }
        return null;
    }
    
    public TreeNode makeIncreasingBSTRight(TreeNode root){
        if(root!=null){
            TreeNode rightNode = makeIncreasingBSTRight(root.right);
            TreeNode left = makeIncreasingBST(root.left);
            if(left!=null){
                
                left.right = root;
                root.left = null;
                
                
                while(left.left!=null){
                    left = left.left;
                }
            }
            if(rightNode!=null){
                root.right = rightNode;
            }
            return left!=null?left:root;
        }
        return null;
    }
}
//https://leetcode.com/problems/increasing-order-search-tree/