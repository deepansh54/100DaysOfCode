class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] balls = new int[n];
        for(int k=0;k<n;k++){
            int j=k;
            //System.out.println("k: "+k);
            for(int i=0;i<m;i++){
                //System.out.println("i : "+i+" j: "+j);
                if(grid[i][j]==1){
                    if(j+1==n || grid[i][j+1] == -1){
                        j=-1;
                        break;
                    }
                    else{
                        j++;
                    }
                }
                else{
                    if(j==0 || grid[i][j-1] == 1){
                        j=-1;
                        break;
                    }
                    else{
                        j--;
                    }
                }
            }
            balls[k] = j;
        }
        return balls;
    }
}
//https://leetcode.com/problems/where-will-the-ball-fall/