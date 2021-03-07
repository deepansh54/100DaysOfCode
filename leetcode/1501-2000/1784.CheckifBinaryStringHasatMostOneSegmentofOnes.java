class Solution {
    public boolean checkOnesSegment(String s) {
        boolean found =false;
        int idx = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                if(found){
                    if(idx!=i-1){
                        return false;
                    }
                    idx = i;
                }
                else{
                    found = true;
                    idx = i;
                }
            }
            
        }
        return true;
    }
}
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
