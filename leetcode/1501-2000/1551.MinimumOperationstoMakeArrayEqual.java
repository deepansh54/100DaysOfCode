class Solution {
    public int minOperations(int n) {
        if(n%2==0){
            return ((2*1 + ((n/2)-1)*2)*(n/2))/2;
        }
        else{
            return ((2*2 + ((n/2)-1)*2)*(n/2))/2;
        }
    }
}
//https://leetcode.com/problems/minimum-operations-to-make-array-equal/
