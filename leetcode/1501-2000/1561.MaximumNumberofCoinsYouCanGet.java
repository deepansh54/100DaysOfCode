class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length/3;
        int sum=0;
        for(int i= piles.length-2; i>=0 && n>0 ;i-=2,n--){
            sum+=piles[i];
        }
        return sum;
    }
}
//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
