class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum =0;
        int n= cardPoints.length;
        for(int num: cardPoints){
            sum+=num;
        }
        if(n-k==0){
            return sum;
        }
        int c = 0;
        for(int i=0;i<(n-k);i++){
            c+=cardPoints[i];
        }
        int max = sum-c;
        for(int i=n-k,j=0;i<n;i++,j++){
            c+=cardPoints[i];
            c-=cardPoints[j];
            max = Math.max(max, sum-c);
        }
        return max;
    }
}
//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
