class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] base = new int[26];
        for(int i = 0; i<chars.length(); i++){
            base[chars.charAt(i)-'a']++;
        }
        int[] str = new int[26];
        int count = 0;
        for(String w : words){
            str = new int[26];
            for(int i = 0; i<w.length(); i++){
                str[w.charAt(i)-'a']++;
            }
            boolean good = true;
            for(int i=0; i<26; i++){
                if(str[i]>base[i]){
                    good = false;
                    break;
                }
            }
            if(good){
                count+=w.length();
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
