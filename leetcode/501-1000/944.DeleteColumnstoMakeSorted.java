class Solution {
    public int minDeletionSize(String[] A) {
        int n = A[0].length()-1;
        int c = 0;
        while(n>=0){
            char p = '0';
            for(String s : A){
                if(s.charAt(n) < p){
                    c++;
                    break;
                }
                p = s.charAt(n);
            }
            n--;
        }
        return c;
    }
}
//https://leetcode.com/problems/delete-columns-to-make-sorted/
