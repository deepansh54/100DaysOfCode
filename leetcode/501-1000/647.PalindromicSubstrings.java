class Solution {
    public int countSubstrings(String s) {
        int count =0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                count+=isPalindrome(s,i,j);
            }
        }
        return count;
    }
    public int isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
//https://leetcode.com/problems/palindromic-substrings/
