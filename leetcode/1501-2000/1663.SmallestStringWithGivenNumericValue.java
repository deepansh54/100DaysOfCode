class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder s = new StringBuilder();
        while(k-n+1>26){
            s.append("z");
            k-=26;
            n--;
        }
        s.insert(0,(char)(k-n+'a'));
        n--;
        while(n>0){
            s.insert(0,'a');
            n--;    
        }
        return s.toString();
    }
}
//https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/
