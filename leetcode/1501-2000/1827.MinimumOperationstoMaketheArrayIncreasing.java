class Solution {
    public int minOperations(int[] nums) {
        int c = 0;
        int d = 0;
        for(int i=1; i<nums.length ;i++){
            if(nums[i-1]>=nums[i]){
                d = nums[i-1]-nums[i]+1;
                c+=d;
                nums[i]+=d;
            }
        }
        return c;
    }
}
//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/