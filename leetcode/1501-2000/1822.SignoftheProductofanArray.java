class Solution {
    public int arraySign(int[] nums) {
        int k = 0;
        for(int a : nums){
            if(a == 0){
                return 0;
            }
            if(a<0){
                k++;
            }
        }
        return k%2 == 0 ? 1 : -1;
    }
}
//https://leetcode.com/problems/sign-of-the-product-of-an-array/
