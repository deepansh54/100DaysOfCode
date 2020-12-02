class Solution {
    public String generateTheString(int n) {
        StringBuilder s = new StringBuilder();
        int len1 = 0;
        int len2=0;
        if(n%2==0){
            len1 = n/2;
            len2 = n/2;
        }
        else{
            len1 = n/2;
            len2 = n-n/2;
        }
        for(int i=0;i<len1;i++){
            s.append('a');
        }
        for(int i=0;i<len2;i++){
            s.append('b');
        }
        return s.toString();
    }
}
//https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/