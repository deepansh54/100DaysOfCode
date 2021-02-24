class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] a =new int[26];
        for(char c : allowed.toCharArray()){
            a[c-'a']++;
        }
        int count = 0;
        for (String s : words){
            count++;
            for(char c : s.toCharArray()){
                if(a[c-'a'] == 0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/count-the-number-of-consistent-strings/
