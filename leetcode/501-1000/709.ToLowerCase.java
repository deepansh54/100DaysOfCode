class Solution {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder();
        for(int i= 0; i<str.length();i++){
            int c = str.charAt(i);
            if(c>=65 && c<=90){
                c+=32;
            }
            s.append((char)c);
        }
        return s.toString();
    }
}
//https://leetcode.com/problems/to-lower-case/