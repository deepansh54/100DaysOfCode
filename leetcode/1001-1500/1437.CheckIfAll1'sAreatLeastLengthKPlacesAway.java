class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n=0;
        boolean found = false;
        for(int a : nums){
            if(a==1){
                if(found && n<k)return false;
                n=0;
                found=true;
            }
            else{
                n++;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
