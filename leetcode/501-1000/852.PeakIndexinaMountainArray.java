class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        for(; i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return i;
            }
        }
        return i;
    }
}
//https://leetcode.com/problems/peak-index-in-a-mountain-array/