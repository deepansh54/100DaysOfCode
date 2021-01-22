class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int[] m1 = new int [26];
        int[] m2 = new int [26];
        for(char a : word1.toCharArray()){
            m1[a-'a']++;
        }
        for(char a : word2.toCharArray()){
            m2[a-'a']++;
        }
        for(int i=0;i<26;i++){
            if(m1[i]>0 && m2[i] == 0 || m2[i]>0 && m1[i]==0){
                return false;
            }
        }
        Arrays.sort(m1);
        Arrays.sort(m2);
        for(int i=0;i<26;i++){
            if(m1[i] != m2[i]){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/determine-if-two-strings-are-close/
