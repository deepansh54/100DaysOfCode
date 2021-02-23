class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] a : matrix){
            if(Arrays.binarySearch(a,target)>=0){
                return true;
            }
        }
        return false;
    }
}
//https://leetcode.com/problems/search-a-2d-matrix-ii/
