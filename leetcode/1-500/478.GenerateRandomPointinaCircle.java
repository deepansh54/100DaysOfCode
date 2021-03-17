class Solution {
    double r = 0.0;
    double h = 0.0;
    double k = 0.0;
    public Solution(double radius, double x_center, double y_center) {
        this.r = radius;
        this.h = x_center;
        this.k = y_center;
    }
    
    public double[] randPoint() {
        double x = h-r + Math.random() * 2 * r;
        double y = k-r + Math.random() * 2 * r;
        while(Math.pow(x-h,2) + Math.pow(y-k,2) > Math.pow(r,2)){
            x = h-r + Math.random() * 2 * r;
            y = k-r + Math.random() * 2 * r;
        }
        return new double[]{x,y};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
//https://leetcode.com/problems/generate-random-point-in-a-circle/