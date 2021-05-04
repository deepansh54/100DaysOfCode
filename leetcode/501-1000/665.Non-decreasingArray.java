class Solution {
    public boolean checkPossibility(int[] nums) {
        int c = 1;
        for(int i=nums.length-1; i>0; i--){
            if(nums[i-1] > nums[i]){
                if(c<=0){
                    return false;
                }
                else{
                    c--;
                    if(i+1 == nums.length){
                        nums[i]=nums[i-1];
                    }
                    else if(i+1 < nums.length && nums[i-1] <= nums[i+1]){
                        nums[i] = nums[i+1];
                    }
                    else{
                        nums[i-1] = nums[i];
                    }
                }
            }
        }
        return true;
    }
}

// TestCases
// [4,2,3]
// [4,2,1]
// [5,7,7,1,1,8]
// [1,2,4,5,3]

//https://leetcode.com/problems/non-decreasing-array/
