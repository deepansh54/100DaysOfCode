class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for(char c : s.toCharArray()){
            a[c-'a']++;
        }
        for(char c : t.toCharArray()){
            a[c-'a']--;
        }
        for(int p : a){
            if(p!=0){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/valid-anagram/
