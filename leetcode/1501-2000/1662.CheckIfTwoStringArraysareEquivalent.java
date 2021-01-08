class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int s1 =0;
        int s2=0;
        int i=0;
        int j=0;
        int w1Len = word1.length;
        int w2Len = word2.length;
        
        while(s1 < w1Len && s2 < w2Len){
            int len1 = word1[s1].length();
            int len2 = word2[s2].length();
            while(i<len1 && j<len2){
                if(word1[s1].charAt(i) == word2[s2].charAt(j)){
                    i++;j++;
                }
                else {
                    return false;
                }
            }
            if(i == len1){
                s1++;i=0;
            }
            if(j == len2){
                s2++;j=0;
            }
        }
        if(s1<w1Len || s2<w2Len){
            return false;
        }
        return true;
    }
}
//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/