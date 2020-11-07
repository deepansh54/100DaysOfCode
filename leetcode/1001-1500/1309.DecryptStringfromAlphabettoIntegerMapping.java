class Solution {
    public String freqAlphabets(String s) {
        StringBuilder r = new StringBuilder();
        for(int i=0;i<s.length();){
            if(i+2 < s.length() && s.charAt(i+2)=='#'){
                r.append((char)((s.charAt(i)-48)*10+(s.charAt(i+1)-48)+96));
                i+=3;
            }
            else{
                r.append((char)(s.charAt(i)+48));
                i++;
            }
        }
        return r.toString();
    }
}
//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/