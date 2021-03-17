class Solution {
    double r = 0.0;
    double h = 0.0;
    double k = 0.0;
    Map<Double, Boolean> m;
    public Solution(double radius, double x_center, double y_center) {
        this.r = radius;
        this.h = x_center;
        this.k = y_center;
        this.m = new HashMap<>();
    }
    
    public double[] randPoint() {
        double x = Math.random()*r;
        x = h + (Math.random()>0.5 ? x : -x);
        x = (Math.round(x*100000)/100000.00);
        while(m.containsKey(x) || Math.abs(x - h) == r){
            x = Math.random()*r;
            x = h + (Math.random()>0.5 ? x : -x);    
            x = (Math.round(x*100000)/100000.00);
        }
        m.put(x, true);
        double y = k + Math.sqrt(r*r - (x-h)*(x-h));
        if(x> h+r || x< h-r || y > k+r || y < k-r || ((x-h)*(x-h) + (y-k)*(y-k) - r*r > 0.000001)){
            System.out.println("x="+x +" y="+y);
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