class Solution {
    public int minSideJumps(int[] obstacles) {
        int n = obstacles.length;
        int [][] lanes  = new int[4][n];

        for(int i=n-2; i>=0 ; i--){
            
            lanes[obstacles[i]][i] = -1;
            lanes[obstacles[i]][i+1] = 2*n;
            
            lanes[1][i]=lanes[1][i+1]<0 ? Math.min(lanes[2][i+1]+1,lanes[3][i+1]+1) : lanes[1][i+1];
            
            lanes[2][i]=lanes[2][i+1]<0 ? Math.min(lanes[1][i+1]+1,lanes[3][i+1]+1) : lanes[2][i+1];
            lanes[3][i]=lanes[3][i+1]<0 ? Math.min(lanes[2][i+1]+1,lanes[1][i+1]+1) : lanes[3][i+1];
            
            lanes[obstacles[i]][i] = -1;
            
        }
        
        // System.out.println("~~~~~~~~~~~~~~~~~~");
        // System.out.println(Arrays.toString(lanes[1]));
        // System.out.println(Arrays.toString(lanes[2]));
        // System.out.println(Arrays.toString(lanes[3]));
        
        return lanes[2][0];
    }
}
//https://leetcode.com/problems/minimum-sideway-jumps/
