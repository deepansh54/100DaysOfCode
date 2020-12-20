class Solution {
    public int heightChecker(int[] heights) {
        int[] a = new int [100+1];
        for(int i =0 ;i<heights.length;i++){
            a[heights[i]]++;
        }
        int n=0;
        int count= 0;
        for(int i =1 ;i<=100 && n<heights.length;i++){
            while(a[i]!=0){
                if(heights[n]!=i){
                    count++;
                }
                n++;
                a[i]--;
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/height-checker/