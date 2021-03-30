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
    int i = -1;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> res = new ArrayList<>();
        preorder(root, voyage, res, null);
        return res;
    }
    public void preorder(TreeNode root , int[] voyage, List<Integer> res, TreeNode prevRoot){
        if(root == null || i >= voyage.length || (!res.isEmpty() && res.get(0)==-1)){
            return;
        }
        i++;
        //System.out.println("proot="+(prevRoot!=null?prevRoot.val:null)+" Root="+root.val+ " v="+voyage[i]+" i="+i);
        if(root.val!=voyage[i]){
            if(prevRoot == null){
                res.clear();
                res.add(-1);
                return;
            }
            boolean left = prevRoot.left!=null && prevRoot.left.val == voyage[i];
            boolean right = prevRoot.right!=null && prevRoot.right.val == voyage[i];
            if(left || right){
                if(left){
                    root = prevRoot.left;
                }
                else{
                    root = prevRoot.right;
                }
                res.add(prevRoot.val);
                TreeNode tmp = prevRoot.left;
                prevRoot.left = prevRoot.right;
                prevRoot.right = tmp;
            }
            else{
                res.clear();
                res.add(-1);
                return;
            }
        }
        
        preorder(root.left, voyage, res, root);
        preorder(root.right, voyage, res, root);
    }
}
/*
TestCases
[1,null,2,null,3]
[1,3,2]
[1,2,null,3]
[1,3,2]
[1,null,2]
[1,2]
[2,1,4,5,null,3]
[2,4,3,1,5]
[1,2]
[2,1]
[1,2,3]
[1,2,3]
[1,2,3]
[1,3,2]
*/
//https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/