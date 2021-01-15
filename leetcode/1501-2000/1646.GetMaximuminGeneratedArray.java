class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n+2];
        nums[0] = 0;
        nums[1] = 1;
        int max = -1;
        for(int i=1, j=0; ;i++){
            j=2*i;
            if(j <= n){
                nums[j] = nums[i];
                if(max<nums[j]){
                    max = nums[j];
                }
                //System.out.println("i="+i+" nums["+j+"]="+nums[j]);
            }            
            j++;
            if(j <= n){
                nums[j] = nums[i] + nums[i + 1];
                if(max<nums[j]){
                    max = nums[j];
                }
                //System.out.println("i="+i+" nums["+j+"]="+nums[j]);
            }
            else{
                break;
            }
        }
        return n>=2 ? max : nums[n];
    }
}
//https://leetcode.com/problems/get-maximum-in-generated-array/
