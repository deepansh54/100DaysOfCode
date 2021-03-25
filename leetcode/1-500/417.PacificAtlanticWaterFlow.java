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
                    pacific[i][j] =  true;
                }
                else if(pacific[i][j-1] && matrix[i][j-1]<=matrix[i][j]){
                    pacific[i][j] =  true;
                }
            }
        }
        
        for(int i=m-1;i>=1;i--){
            for(int j=n-1; j>=1;j--){
                if(pacific[i][j]){
                    if(!pacific[i-1][j] && matrix[i-1][j]>=matrix[i][j]){
                        pacific[i-1][j] = true;
                    }
                    
                    if(!pacific[i][j-1] && matrix[i][j-1]>=matrix[i][j]){
                        pacific[i][j-1] = true;
                    }
                }
            }
        }
        
        
        for(int i=m-2;i>=0;i--){
            for(int j=n-2; j>=0;j--){
                if(atlantic[i+1][j] && matrix[i+1][j]<=matrix[i][j]){
                    atlantic[i][j] =  true;
                }
                else if(atlantic[i][j+1] && matrix[i][j+1]<=matrix[i][j]){
                    atlantic[i][j] =  true;
                }
            }
        }
        
        for(int i=0;i<m-1;i++){
            for(int j=0; j<n-1;j++){
                if(atlantic[i][j]){
                    if(!atlantic[i+1][j] && matrix[i+1][j]>=matrix[i][j]){
                        atlantic[i+1][j] = true;
                    }
                    
                    if(!atlantic[i][j+1] && matrix[i][j+1]>=matrix[i][j]){
                        atlantic[i][j+1] = true;
                    }
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
        System.out.println("~~~~~matrix~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
                System.out.println("~~~~~pacific~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(pacific[i]));
        }
        System.out.println("~~~~~atlantic~~~~~~~~~~~~~~~~~~");

        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(atlantic[i]));
        }
        
        return result;
    }
}
//https://leetcode.com/problems/pacific-atlantic-water-flow/
