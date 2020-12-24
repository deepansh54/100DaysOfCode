class Solution {
    public String decodeAtIndex(String S, int K) {
        //System.out.println(S+ " K="+K);
        Long len = 0L;
        for(int i =0; i<S.length();i++){
            if(S.charAt(i) >= 'a'){
                len++;
                if(K==len){
                    return String.valueOf(S.charAt(i));
                }
            }
            else{
                int count  = (int)(S.charAt(i)-'0');
                int currLen = len.intValue();
                len*=count;        
                //System.out.println("len="+len+" currLen=" +currLen+ " K="+K);
                if(K<=len){
                    count = K%currLen;
                    K=(count == 0 ? currLen : count);
                    return decodeAtIndex(S.substring(0,i), K);
                }             
            }
        }
        return null;
    }
}
//https://leetcode.com/problems/decoded-string-at-index/