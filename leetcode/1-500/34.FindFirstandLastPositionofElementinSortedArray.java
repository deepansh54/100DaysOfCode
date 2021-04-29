class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = binSearch(nums, target);
        if(i<0){
            return new int[]{-1,-1};
        }
        else{
            int j = binSearch(nums, target-1);
            int k = binSearch(nums, target+1);
            if(j<0){
                j=(j+1)*(-1);
            }
            else{
                j=binSearch2(nums,target,j,i);
            }
            if(k<0){
                k=(k+1)*(-1) -1;
            }
            else{
                k=binSearch2(nums,target+1,i,k)-1;
            }
            return new int[]{j,k};
        }
    }
    public int binSearch(int[] n, int v){
        int low = 0;
        int high = n.length-1;
        int mid = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(n[mid] == v){
                return mid;
            }
            else if(v<n[mid]){
                high=mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ((-1)*low)-1;
    }
    public int binSearch2(int[] n, int v, int i, int z){
        int low = i;
        int high = z;
        int mid = 0;
        while(low<=high){
            mid = low + (high-low)/2;
            if(n[mid]!=v && n[mid+1]==v){
                return mid+1;
            }
            if(n[mid] == v){
                high=mid;
            }
            else{
                low=mid;
            }
        }
        return ((-1)*low)-1;
    }
}
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
