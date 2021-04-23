class Solution {
    public int countBinarySubstrings(String s) {
        int o = 0;
        int z = 0;
        int count = 0;
        char lastChar = ' ';
        for(char c : s.toCharArray()){
            if(c == '0'){
                if(lastChar == '0'){
                    z++;
                }
                else{
                    z=1;
                }
                if(o!=0 && o>=z){
                    count++;
                }                
            }
            else{
                if(lastChar == '1'){
                    o++;
                }
                else{
                    o=1;
                }
                if(z!=0 && z>=o){
                    count++;
                } 
            }
            lastChar = c;
        }
        return count;
    }
}
//https://leetcode.com/problems/count-binary-substrings/
