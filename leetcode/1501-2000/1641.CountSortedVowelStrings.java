class Solution {
    public int countVowelStrings(int n) {
        if(n==1)return 5;
        int[] arr = new int[6];
        for(int i=1;i<6;i++){
            arr[i]=1;
        }
        for(int i=3;i<=n;i++){
            for(int j=1;j<6;j++){
                arr[j] += arr[j-1];
            }            
        }
        int count=0;
        for(int i=1;i<6;i++){
            count += arr[i]*(6-i);
        }
        return count;
    }
}
//https://leetcode.com/problems/count-sorted-vowel-strings/
