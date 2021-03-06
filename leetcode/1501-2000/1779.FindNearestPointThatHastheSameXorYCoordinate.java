class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int d = 100000;
        int idx = -1;
        int dis = 0;
        for(int i=0;i<points.length;i++){
            if(points[i][0] == x){
                dis = Math.abs(y-points[i][1]);
                if(dis< d ){
                    idx = i;
                    d = dis;
                }
            }
            else if(points[i][1] == y){
                dis = Math.abs(x-points[i][0]);
                if(dis < d ){
                    idx = i;
                    d = dis;
                }
            }
        }
        return idx;
    }
}
//https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/
