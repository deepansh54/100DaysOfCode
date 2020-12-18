class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] countArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    count++;
                }
            }
            countArr[i] = count;
        }
        for(int i=0;i<nums.length;i++){
            if(countArr[i]>0){
                for(int j=i+1;j<nums.length;j++){
                    if(countArr[j]>0 && nums[j]>nums[i]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
//https://leetcode.com/problems/increasing-triplet-subsequence/