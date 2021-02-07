class Solution {
    public boolean check(int[] nums) {
        int index = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                index = i;
                break;
            }
        }
        if(index !=0 & nums[0]<nums[nums.length-1]){
            return false;
        }
        for(int i=index+1;i<nums.length;i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
