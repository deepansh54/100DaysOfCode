class Solution {
    
    public int[] maxSlidingWindow(int[] nums, int k) {

        if(k==1) return nums;
        
        int n = nums.length;
        int[] log = new int[n+1];
        log[1] = 0;
        for (int i = 2; i <= n; i++)
            log[i] = log[i/2] + 1;
        
        int m = (int)Math.ceil(Math.log(n)/Math.log(2));
        
        int[][] s = new int[n][m+1];
        
        for (int i = 0; i < n; i++)
            s[i][0] = nums[i];

        for (int j = 1; j <= m; j++)
            for (int i = 0; i + (1 << j) <= n; i++)
                s[i][j] = Math.max(s[i][j-1], s[i + (1 << (j - 1))][j - 1]);
        
        int[] results = new int[n-k+1];
        for(int i =0 ; i<n-k+1;i++){
            int j = log[i+k-1 - i + 1];
            results[i] = Math.max(s[i][j], s[i+k-1 - (1 << j) + 1][j]);
        }
        return results;
    }
}
//https://leetcode.com/problems/sliding-window-maximum/