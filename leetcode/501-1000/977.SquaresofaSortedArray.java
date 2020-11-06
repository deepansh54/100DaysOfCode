class Solution {
    public int[] sortedSquares(int[] A) {
        int m = -1;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){
                m = i;
            }
            A[i] = A[i]*A[i];
        }
        if(m>-1){
            Arrays.sort(A);
        }        
        return A;
    }
}
//https://leetcode.com/problems/squares-of-a-sorted-array/