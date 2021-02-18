class Solution {
    public int maxArea(int[] height) {
        int a1 = 0;
        int a2 = 0;
        int i1 = 0;
        int i2 = height.length-1;
        int area = 0;
        while(i1<i2){
            
            if(height[i1]<height[i2]){
                area = Math.max(height[i1] * (i2-i1) , area);
                i1++;
            }
            else{
                area = Math.max(height[i2] * (i2-i1) , area);
                i2--;
            }
        }
        return area;
    }
}
//https://leetcode.com/problems/container-with-most-water/
