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
    TreeNode r = null;
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        addRow(root, v, d, 1);
        return r!=null? r : root;
    }
    public void addRow(TreeNode root, int v, int d, int depth){
        if(root!=null){
            if(d-1 == 0){
                r = new TreeNode(v);
                r.left = root;
                return;
            }
            else if(d-1 == depth){
                TreeNode left = new TreeNode(v);
                left.left = root.left;
                TreeNode right = new TreeNode(v);
                right.right = root.right;
                root.left = left;
                root.right = right;
                return;
            }
            addRow(root.left, v, d, depth+1);
            addRow(root.right, v, d, depth+1);
        }
    }
}
//https://leetcode.com/problems/add-one-row-to-tree/
