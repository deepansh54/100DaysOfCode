class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int m = 9999999;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                m = Math.min(m,Math.abs(i-start));
            }
        }
        return m;
    }
}
//https://leetcode.com/problems/minimum-distance-to-the-target-element/
