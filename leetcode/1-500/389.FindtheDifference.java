class Solution {
    public char findTheDifference(String s, String t) {
        int[] a = new int[26];
        for(char c : t.toCharArray()){
            a[c-'a']++;
        }
        for(char c : s.toCharArray()){
            a[c-'a']--;
        }
        char ans = 'a';
        for(int i=0;i<26;i++){
            if(a[i]>0){
                ans = (char)(i+'a');
            }
        }
        return ans;
    }
}
//https://leetcode.com/problems/find-the-difference/
