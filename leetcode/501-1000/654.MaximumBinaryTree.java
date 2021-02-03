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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length);
    }
    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if(start<end){
            //find max
            int max = nums[start];
            int maxIndex = start;
            for(int i=start+1;i<end;i++){
                if(nums[i]>max){
                    max = nums[i];
                    maxIndex = i;
                }
            }
            TreeNode root = new TreeNode(max);
            root.left = constructMaximumBinaryTree(nums,start,maxIndex);
            root.right = constructMaximumBinaryTree(nums,maxIndex+1,end);
            return root;
        }
        else {
            return null;
        }        
    }
}
//https://leetcode.com/problems/maximum-binary-tree/
