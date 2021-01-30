class Solution {
    public int[] replaceElements(int[] arr) {
        int[] sol = new int[arr.length];
        int max = -1;
        for(int i = arr.length-1; i>=0; i--){
            sol[i] = max;
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return sol;
    }
}
//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
