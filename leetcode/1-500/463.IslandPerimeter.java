class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0 ;
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    p += (
                            (i-1 < 0 || grid[i-1][j]==0 ? 1 : 0) +
                            (j-1 < 0 || grid[i][j-1]==0 ? 1 : 0) +
                            (i+2>grid.length || grid[i+1][j]==0 ? 1 : 0) +
                            (j+2>grid[i].length || grid[i][j+1]==0 ? 1 : 0)
                         );
                    //System.out.println("grid["+i+"]["+j+"] "+grid[i][j]);
                    //System.out.println("p "+p);
                }
            }
        }
        return p;
    }
}
//https://leetcode.com/problems/island-perimeter/