class Solution {
    public String decodeString(String s) {
        StringBuilder d = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                i = getRepeatedString(i,s,d);
            }
            else{
                d.append(s.charAt(i));
            }
        }
        return d.toString();
    }
    private int getRepeatedString(int i, String s, StringBuilder d){
        StringBuilder p = new StringBuilder();
        while(s.charAt(i)!='['){
            p.append(s.charAt(i));
            i++;
        }
        Integer r = Integer.parseInt(p.toString());
        i++;
        p = new StringBuilder();
        while(s.charAt(i)!=']'){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                i = getRepeatedString(i,s,p);
            }
            else{
                p.append(s.charAt(i));
            }
            i++;
        }
        String n = p.toString();
        while(r>0){
            d.append(n);
            r--;
        }
        return i;
    }
}
//https://leetcode.com/problems/decode-string/