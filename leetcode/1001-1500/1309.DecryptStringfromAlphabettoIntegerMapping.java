class Solution {
    public String freqAlphabets(String s) {        
        for(int i=10; i<27;i++){
            s = s.replaceAll(String.valueOf(i)+"#", String.valueOf((char)(i+96)));
        }
        for(int i=1; i<10; i++){
            s = s.replaceAll(String.valueOf(i), String.valueOf((char)(i+96)));
        }
        return s;
    }
}
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/