class Solution {
    public int largestRectangleArea(int[] heights) {
        int [] greaterCounts = new int[heights.length];
        for(int i=0;i<heights.length;i++){
            boolean smallerFound=false;
            for(int j=i;j>=0;j--){
                if(heights[j]>=heights[i]){
                    greaterCounts[i]++;
                }
                else {
                    break;
                }
            }
            for(int j=i+1;j<heights.length;j++){
                if(heights[j]>=heights[i]){
                    greaterCounts[i]++;
                }
                else {
                    break;
                }
            }
        }
        //System.out.println("Greater Counts: "+Arrays.toString(greaterCounts));
        int maxArea = 0;
        for(int i=0;i<heights.length;i++){
            int area = heights[i]*greaterCounts[i];
            if(area>maxArea){
                maxArea = area;
            }
        }
        return maxArea;
    }
}
//https://leetcode.com/problems/largest-rectangle-in-histogram/