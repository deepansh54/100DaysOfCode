class Solution {
    public int numSplits(String s) {
        
        boolean[] a = new boolean[26];
        int[] uniqueArr = new int[s.length()];
        int[] uniqueReverseArr = new int[s.length()];
        char[] sc = s.toCharArray();
        int tmpIndex = 0;
        int unique = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
            tmpIndex = sc[i] - 97;
            if(!a[tmpIndex]){
                unique++;
                a[tmpIndex] = true;
            }
            uniqueArr[i] = unique;
        }
        unique = 0;
        a = new boolean[26];
        int goodSplits = 0;
        for(int i=len-1; i>0; i--){
            tmpIndex = sc[i] - 97;
            if(!a[tmpIndex]){
                unique++;
                a[tmpIndex] = true;
            }
            uniqueReverseArr[i] = unique;
            if(uniqueArr[i-1] == uniqueReverseArr[i]){
                goodSplits++;
            }
        }
        return goodSplits;
    }
}
//https://leetcode.com/problems/number-of-good-ways-to-split-a-string/