class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] a = new int[100];
        int max = -1;
        for(int i =lowLimit ; i <=highLimit ;i++){
            int k = 0;
            int c = i;
            while(c>0){
                k+=c%10;
                c/=10;
            }
            a[k]++;
            if(a[k]>max){
                max = a[k];
            }
        }
        return max;
    }
}
//https://leetcode.com/problems/maximum-number-of-balls-in-a-box/
