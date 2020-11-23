class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 1)return true;
        if(n%2!=0 || n==0){
            return false;
        }
        double v = Math.log(n)/Math.log(2);
        double v1 = Math.floor(v); 
        //System.out.println(v);
        //System.out.println(v1);
        return Math.abs(v-v1) <= 0.00000000001d;
    }
}
//https://leetcode.com/problems/power-of-two/