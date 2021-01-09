class Solution {
    public int totalMoney(int n) {
        int sum= 1;
        int inc = 1;
        for( int i = 2; i<=n;i++ ){
            inc++;
            if(i%7==1){
                inc=i/7+1;
            }
            sum+=inc;
        }
        return sum;
    }
}
//https://leetcode.com/problems/calculate-money-in-leetcode-bank/