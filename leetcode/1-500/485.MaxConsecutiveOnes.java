class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int j = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                j++;
            }
            else{
                if(j>=c){
                    c=j;
                }
                j=0;
            }
        }
        
        if(j>=c){
            c=j;
        }
        
        return c;
    }
}
//https://leetcode.com/problems/max-consecutive-ones/
