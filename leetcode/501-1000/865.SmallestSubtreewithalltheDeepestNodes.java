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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int maxDepth = findDepth(root);
        //System.out.println(maxDepth);
        Stack<TreeNode> commonAncestors = deepestAncestor(root, new Stack<TreeNode>(), new Stack<TreeNode>(), maxDepth, 1);
        //System.out.println(commonAncestors);
        return commonAncestors.pop();
    }
    
    private int findDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(findDepth(root.left)+1, findDepth(root.right)+1);
    }
    
    private Stack<TreeNode> deepestAncestor(TreeNode root, Stack<TreeNode> currentAncestors, Stack<TreeNode> commonAncestors, int maxDepth, int depth){
        if(root == null){
            return commonAncestors;
        }
        currentAncestors.push(root);
        commonAncestors = deepestAncestor(root.left, currentAncestors, commonAncestors, maxDepth, depth + 1);
        commonAncestors = deepestAncestor(root.right, currentAncestors, commonAncestors, maxDepth, depth + 1);
        if(depth == maxDepth){
            
            //System.out.println("--Depth Equal Start--");
            //System.out.println(root.val);
            //System.out.println(currentAncestors);
            
            Stack<TreeNode> backup = new Stack<>();
            if(commonAncestors.isEmpty()){
                commonAncestors = (Stack)currentAncestors.clone();
            }
            else if(commonAncestors.size() != currentAncestors.size()){
                while(currentAncestors.size() != commonAncestors.size()){
                    backup.push(currentAncestors.pop());
                }
            }
            while(commonAncestors.peek() != currentAncestors.peek()){
                backup.push(currentAncestors.pop());
                commonAncestors.pop();
            }
            //System.out.println(commonAncestors);
            while(!backup.isEmpty()){
                currentAncestors.push(backup.pop());
            }
            //System.out.println(currentAncestors);
            //System.out.println("--Depth Equal End--");
        }
        currentAncestors.pop();
        return commonAncestors;
    }
}
//https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/