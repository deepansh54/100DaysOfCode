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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer> p = new PriorityQueue<>();

        getList(root1, p);
        getList(root2, p);
        List<Integer> res = new ArrayList<>();
        while(!p.isEmpty()){
            res.add(p.poll());
        }
        return res;
    }
    public void getList(TreeNode root, PriorityQueue<Integer> l1){
        if( root != null ){
            //System.out.println("root="+root);
            getList(root.left, l1);
            l1.add(root.val);
            getList(root.right, l1);
        }
    }
}
//https://leetcode.com/problems/all-elements-in-two-binary-search-trees/
