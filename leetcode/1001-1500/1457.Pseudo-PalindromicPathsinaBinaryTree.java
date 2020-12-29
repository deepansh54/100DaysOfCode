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
    int[] values = new int[10];
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root==null){
            return 0;
        }
        values[root.val]+=1;
        int left = pseudoPalindromicPaths(root.left);
        int right = pseudoPalindromicPaths(root.right);
        //System.out.println("root: "+root.val+" left:"+left+" right:"+right);
        if(root.left == null && root.right == null){
            //System.out.println(Arrays.toString(values));
            boolean odd = false;
            int pathFound = 1;
            for(int i=1;i<=9;i++){
                if(values[i]%2!=0){
                    if(!odd){
                        odd=true;
                    }
                    else{
                        pathFound = 0;
                        break;
                    }
                }
            }
            values[root.val]-=1;
            return pathFound;
        }
        values[root.val]-=1;
        return left + right;
    }
}
//https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/