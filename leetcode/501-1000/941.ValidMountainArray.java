class Solution {
    public boolean validMountainArray(int[] arr) {
        int topIndex = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<=arr[i]){
                if(arr[i+1]==arr[i]){
                    return false;
                }
                else{
                    topIndex = i;
                    break;
                }
            }
        }
        if(topIndex == 0){
            return false;
        }
        for(int i=topIndex+1;i<arr.length;i++){
            if(arr[i-1]<=arr[i]){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/valid-mountain-array/