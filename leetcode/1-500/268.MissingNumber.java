class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        for(int n : nums){
            missing^=n;
        }
        for(int n =0;n<= nums.length;n++){
            missing^=n;
        }
        return missing;
    }
}
//https://leetcode.com/problems/missing-number/
