class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] r = new int[queries.length];
        int i = 0;
        for(int[]q : queries){
            int c = 0;
            for(int[]p : points){
                if(((p[0]-q[0])*(p[0]-q[0]) + (p[1]-q[1])*(p[1]-q[1]) - (q[2]*q[2])) <= 0){
                    c++;
                }
            }
            r[i] = c;
            i++;
        }
        return r;
    }
}
//https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/
