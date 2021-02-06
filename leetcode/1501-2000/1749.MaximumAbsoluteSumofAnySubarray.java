class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSum = 0;
        int absSum = 0;
        for(int a : nums){
            currSum = Math.max(0, currSum+a);
            absSum = Math.max(absSum, currSum);
        }
        //stem.out.println("----------");
        //stem.out.println("currSum "+currSum+" absSum "+absSum);

        int mcurrSum = 0;
        int mabsSum = 0;
        for(int a : nums){
            mcurrSum = Math.min(0, mcurrSum+a);
            mabsSum = Math.min(mabsSum, mcurrSum);
        }
        //stem.out.println("mcurrSum "+mcurrSum+" mabsSum "+mabsSum);
        return Math.max(absSum, Math.abs(mabsSum));
    }
}
//https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/
