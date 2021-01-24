class Solution {
    public int[][] diagonalSort(int[][] mat) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int a=0;a<mat.length;a++){
            for(int i=a,j=0;i<mat.length&&j<mat[0].length;i++,j++){
                pq.add(mat[i][j]);
            }
            for(int i=a,j=0;i<mat.length&&j<mat[0].length;i++,j++){
                mat[i][j]=pq.poll();
            }
        }
        for(int a=1;a<mat[0].length;a++){
            for(int i=0,j=a;i<mat.length&&j<mat[0].length;i++,j++){
                pq.add(mat[i][j]);
            }
            for(int i=0,j=a;i<mat.length&&j<mat[0].length;i++,j++){
                mat[i][j]=pq.poll();
            }
        }
        return mat;
    }
}
//https://leetcode.com/problems/sort-the-matrix-diagonally/
