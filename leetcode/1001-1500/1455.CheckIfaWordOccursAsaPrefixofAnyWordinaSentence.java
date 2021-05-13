class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        int idx = -1;
        for(int i=0;i<s.length;i++){
            if(s[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return idx;
    }
}
//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
