class Solution {
    public int jump(int[] nums) {
        int[] a = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<=i+nums[i] && j<nums.length; j++){
                if(a[j]==0){
                    a[j] = a[i]+1;
                }
                else{
                    a[j]=Math.min(a[j], a[i]+1);
                }
            }
        }
        return a[nums.length-1];
    }
}
//https://leetcode.com/problems/jump-game-ii/
