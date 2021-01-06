class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr.length==0){
            return k;
        }
        else if(arr[arr.length-1]-arr.length < k ){
            return arr[arr.length-1] + (k-(arr[arr.length-1]-arr.length));
        }
        else{
            for(int i =1,j=0 ;j<arr.length && i<arr[arr.length-1];i++){
                if(i == arr[j]){
                    j++;
                }
                else{
                    k--;
                }
                if(k==0){
                    return i;
                }
            }
            return k;
        }
    }
}
//https://leetcode.com/problems/kth-missing-positive-number/