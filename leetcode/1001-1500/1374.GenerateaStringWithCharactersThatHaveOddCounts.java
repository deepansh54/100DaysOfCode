class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        int len1 = 0;
        int len2=0;
        if(n==1){
            return "a";
        }
        if(n==2){
            return "ab";
        }
        if(n%2==0){
            len1 = n-1;
            len2 = 1;
            for(int i=0;i<len1;i++){
                s.append('a');
            }
            for(int i=0;i<len2;i++){
                s.append('b');
            }
        }
        else{
            
            for(int i=0;i<n;i++){
                s.append('c');
            }
        }
        return s.toString();
    }
}
//https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/