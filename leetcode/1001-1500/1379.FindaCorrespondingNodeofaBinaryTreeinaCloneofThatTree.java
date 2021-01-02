/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {         if(original == null){
            return null;
        }
        if(original == target){
            return cloned;
        }
        TreeNode clonedTarget = getTargetCopy(original.left, cloned.left, target);
        if(clonedTarget!=null){
            return clonedTarget;
        }
        clonedTarget = getTargetCopy(original.right, cloned.right, target);
        if(clonedTarget!=null){
            return clonedTarget;
        }
        return null;
    }
}
//https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/