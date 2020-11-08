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
    public int findTilt(TreeNode root) {
        Map<String, Integer> tiltSum = new HashMap<>();
        tiltSum.put("tiltSum", 0);
        nodeSum(root,tiltSum);
        return tiltSum.get("tiltSum");
    }
    private int nodeSum(TreeNode root, Map<String, Integer> tiltSum){
        if(root!=null){
            int leftSum = nodeSum(root.left, tiltSum);
            int rightSum = nodeSum(root.right, tiltSum);
            tiltSum.put("tiltSum", tiltSum.get("tiltSum") + Math.abs(leftSum - rightSum));
            return root.val + leftSum + rightSum;
        }
        return 0;
    }
}
//https://leetcode.com/problems/binary-tree-tilt/
