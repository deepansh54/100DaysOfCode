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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root!=null){
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
            if(root.val>=low && root.val<=high){
                return root;
            }
            else if(root.val < low){
                return root.right;
            }
            else if(root.val > high){
                return root.left;
            }
            else{
                return null;
            }
        }
        
        return root;
    }
}
// TESTCASES
// [114,112,115,50,113,null,null,49,53,null,null,null,null,52,54]
// 51
// 115
// [3,0,4,null,2,null,null,1]
// 1
// 3
// [1,0,2]
// 1
// 2
// [1]
// 1
// 2
// [1,null,2]
// 1
// 3
// [1,null,2]
// 2
// 4

//https://leetcode.com/problems/trim-a-binary-search-tree/
