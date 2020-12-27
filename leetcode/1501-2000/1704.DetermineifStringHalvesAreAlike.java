class Solution {
    public boolean halvesAreAlike(String s) {
        char[] c = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int[] a1 = new int[128];
        int[] a2 = new int[128];
        for(int i=0;i<s.length()/2;i++){
            a1[s.charAt(i)]++;
        }
        for(int i=s.length()/2;i<s.length();i++){
            a2[s.charAt(i)]++;
        }
        for(char b : c){
            a1[0]+=a1[b];
            a2[0]+=a2[b];
        }
        return a1[0]==a2[0];
    }
}
//https://leetcode.com/problems/determine-if-string-halves-are-alike/