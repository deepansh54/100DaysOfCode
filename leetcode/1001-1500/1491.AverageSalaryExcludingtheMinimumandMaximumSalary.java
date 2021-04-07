class Solution {
    public double average(int[] salary) {
        int max = -1;
        int min = 1000006;
        double sum = 0.0;
        for(int a : salary){
            if(a > max){
                max = a;
            }
            if(a < min){
                min = a;
            }
            sum+=a;
        }
        sum-=max;
        sum-=min;
        return sum/(salary.length-2);
    }
}
//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
