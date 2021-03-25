class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if(matrix == null || (matrix.length == 0) || matrix[0].length == 0){
            return new ArrayList<>();
        }
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            pacific[i][0] = true;
            atlantic[i][n-1] = true;
        }
        for(int i=0;i<n;i++){
            pacific[0][i] = true;
            atlantic[m-1][i] = true;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1; j<n;j++){
                if(pacific[i-1][j] && matrix[i-1][j]<=matrix[i][j]){
                    propagate(pacific, matrix, i, j, m, n);
                }
                else if(pacific[i][j-1] && matrix[i][j-1]<=matrix[i][j]){
                    propagate(pacific, matrix, i, j, m, n);
                }
            }
        }        
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2; j>=0;j--){
                if(atlantic[i+1][j] && matrix[i+1][j]<=matrix[i][j]){
                    propagate(atlantic, matrix, i, j, m, n);
                }
                else if(atlantic[i][j+1] && matrix[i][j+1]<=matrix[i][j]){
                    propagate(atlantic, matrix, i, j, m, n);
                }
                
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    result.add(List.of(i,j));
                }
            }
        }
//         System.out.println("~~~~~matrix~~~~~~~~~~~~~~~~~~");

//         for(int i=0;i<m;i++){
//             System.out.println(Arrays.toString(matrix[i]));
//         }
//                 System.out.println("~~~~~pacific~~~~~~~~~~~~~~~~~~");

//         for(int i=0;i<m;i++){
//             System.out.println(Arrays.toString(pacific[i]));
//         }
//         System.out.println("~~~~~atlantic~~~~~~~~~~~~~~~~~~");

//         for(int i=0;i<m;i++){
//             System.out.println(Arrays.toString(atlantic[i]));
//         }
        
        return result;
    }
    
    public void propagate(boolean[][] z , int[][] matrix, int i , int j, int m, int n){
        if(!z[i][j]){
            z[i][j] = true;
            if(i-1>=0 && matrix[i-1][j]>=matrix[i][j]){
                propagate(z, matrix, i-1, j, m, n);
            }
            if(j-1>=0 && matrix[i][j-1]>=matrix[i][j]){
                propagate(z, matrix, i, j-1, m, n);
            }
            if(i+1 < m && matrix[i+1][j]>=matrix[i][j]){
                propagate(z, matrix, i+1, j, m, n);
            }
            if(j+1 < n && matrix[i][j+1]>=matrix[i][j]){
                propagate(z, matrix, i, j+1, m, n);
            } 
        }
    }
}
//https://leetcode.com/problems/pacific-atlantic-water-flow/
