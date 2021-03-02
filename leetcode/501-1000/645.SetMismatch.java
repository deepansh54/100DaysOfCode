class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        boolean[] a = new boolean[10001];
        int sum = 0;
        for(int k : nums){
            
            if(a[k]){
                res[0] = k;
            }
            
            a[k]=true;
            sum+=k;
        }
        sum-=res[0];
        res[1] = nums.length*(nums.length+1)/2 -sum;
        return res;
    }
}
//https://leetcode.com/problems/set-mismatch/
