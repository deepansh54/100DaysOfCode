class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = -1;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i] > maxJump){
                maxJump = i+nums[i];
            }
            if(i>=maxJump){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/jump-game/