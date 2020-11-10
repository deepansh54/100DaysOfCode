class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        boolean odd = len % 2 != 0;
        for(int i=0; i< len; i++){
            for(int j=0;j<len/2;j++){
                if(A[i][j] == A[i][len-j-1]){
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                    A[i][len-j-1] = A[i][j];
                }
            }
            if(odd){
                A[i][len/2] = A[i][len/2] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
//https://leetcode.com/problems/flipping-an-image/