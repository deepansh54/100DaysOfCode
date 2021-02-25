class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] n = Arrays.copyOf(nums, nums.length);
        Arrays.sort(n);
        int i = 0;
        for(;i<n.length;i++){
            if(nums[i]!=n[i]){
                break;
            }
        }
        int j=n.length-1;
        if(i == j+1){
            return 0;
        }
        for(;j>=0;j--){
            if(nums[j]!=n[j]){
                break;
            }
        }
        return j-i+1;
    }
}
//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
