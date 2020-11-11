class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = -1;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]!=0){
                    System.out.println("New start point i="+i+" j="+j+" val"+grid[i][j]);
                    int[][] visited = new int[grid.length][grid[i].length];
                    int gold = findMax(i, j, grid, visited);
                    System.out.println("Gold= "+gold);
                    System.out.println("Visited=");
                    for (int[] row : visited) System.out.println(Arrays.toString(row));
                    if(gold>maxGold){
                        maxGold = gold;
                    }
                }
            }
        }
        return maxGold;
    }
    private int findMax(int i , int j, int[][] grid, int[][] visited){
        //System.out.println("i="+i+" j="+j);
        int gold = grid[i][j];
        int goldDown = 0;
        int goldUp = 0;
        int goldLeft = 0;
        int goldRight = 0;
        visited[i][j] = -1;
        visited = Arrays.stream(visited).map(int[]::clone).toArray(int[][]::new);
        if(i+1 < grid.length && grid[i+1][j]!=0 && visited[i+1][j] != -1){
            goldDown = gold + findMax(i+1,j,grid,visited);
        }
        if(i-1 >= 0 && grid[i-1][j]!=0 && visited[i-1][j] != -1){
            goldUp = gold + findMax(i-1,j,grid,visited);
        }
        if(j+1 < grid[i].length && grid[i][j+1]!=0 && visited[i][j+1] != -1){
            goldRight = gold + findMax(i,j+1,grid,visited);
        }
        if(j-1 >= 0 && grid[i][j-1]!=0 && visited[i][j-1] != -1){
            goldLeft = gold + findMax(i,j-1,grid,visited);
        }
        return Math.max(gold, Math.max(goldUp, Math.max(goldDown, Math.max(goldLeft, goldRight))));
    }
}
//https://leetcode.com/problems/path-with-maximum-gold/