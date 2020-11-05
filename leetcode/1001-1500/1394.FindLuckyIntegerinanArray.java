class Solution {
    public int findLucky(int[] arr) {
        int[] c = new int[501];
        for(int i = 0 ; i<arr.length; i++){
            c[arr[i]]++;
        }
        int maxLucky = -1;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == c[arr[i]] && arr[i] > maxLucky){
                maxLucky = arr[i];
            }
        }
        return maxLucky;
    }
}
//https://leetcode.com/problems/find-lucky-integer-in-an-array/