class Solution {
    public boolean canPartition(int[] nums) {
        int halfsum = 0;
        for(int i=0;i<nums.length;i++){
            halfsum+=nums[i];
        }
        if(halfsum%2!=0){
            return false;
        }
        halfsum/=2;
        return isSubsetSum(nums, nums.length, halfsum);
    }
    private boolean isSubsetSum(int set[], int n, int sum){

        boolean[][] subset = new boolean[n + 1][sum + 1];
        
        for (int i = 0; i <= n; i++)
            subset[i][0] = true;
        for (int i = 1; i <= sum; i++)
            subset[0][i] = false;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (j < set[i - 1])
                    subset[i][j] = subset[i - 1][j];
                if (j >= set[i - 1])
                    subset[i][j] = subset[i - 1][j]
                                   || subset[i - 1][j - set[i - 1]];
            }
        }
        return subset[n][sum];
    }
}
//https://leetcode.com/problems/partition-equal-subset-sum/