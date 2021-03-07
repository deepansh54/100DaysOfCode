class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;

        for(int a : nums){
            sum+=a;
        }
        if(sum == goal){
            return 0;
        }
        long diff = Math.abs(goal -sum);
        //System.out.println("diff="+diff+" sum="+sum+" goal="+goal);
        if(diff <= limit ){
            return 1;
        }
        if(diff%limit == 0){
            return(int) (diff/limit);
        }
        else{
            return(int) ((diff/limit) + 1);
        }
    }
}
//https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum/
