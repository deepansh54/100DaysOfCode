class Solution {
    public int maxProduct(int[] nums) {
        int lastMax = -1;
        int max = -1;
        for(int a : nums){
            if(a>=max){
                lastMax = max;
                max = a;
            }
            else if(a>=lastMax){
                lastMax = a;
            }
        }
        return (lastMax-1)*(max-1);
    }
}
//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
