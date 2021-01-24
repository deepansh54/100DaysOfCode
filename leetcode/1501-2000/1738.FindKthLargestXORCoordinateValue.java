class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue(k);
        for(int i=0; i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                matrix[i][j] ^= matrix[i][j-1]; 
            }
        }
        for(int j=0; j<matrix[0].length;j++){
            for(int i=1;i<matrix.length;i++){
                matrix[i][j] ^= matrix[i-1][j];
            }
        }
        int n=0;
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                n++;
                pq.offer(matrix[i][j]);
                if(n>k){
                    pq.poll();
                }
            }
        }

        return pq.poll();
    }
}
//https://leetcode.com/problems/find-kth-largest-xor-coordinate-value/
