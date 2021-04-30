class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        return 1==n;
    }
}
//https://leetcode.com/problems/power-of-three/
