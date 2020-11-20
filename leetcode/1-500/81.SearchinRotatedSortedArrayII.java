class Solution {
    public boolean search(int[] nums, int target) {
        
        return find(nums,target, 0,nums.length-1);
    }
    private boolean find(int[] nums, int target, int low, int high){
        if(high<low){
            return false;
        }
        int mid = low+(high-low)/2;
        //System.out.println(" mid "+mid);

        if(target == nums[mid]){
            return true;
        }
        if(nums[low] < nums[mid]){
            //System.out.println("l<m low "+low+" mid "+mid);
            if(nums[low] <= target && target < nums[mid]){
                return binSearch(nums,target, low, mid-1);
            }
            return find(nums,target, mid+1,high);
        }
        else if(nums[high] > nums[mid]){
            //System.out.println("h>m high "+high+" mid "+mid);
            if(nums[high] >= target && target > nums[mid]){
                return binSearch(nums,target, mid+1, high);
            }
            return find(nums,target, low,mid-1);
        }
        else{
            //System.out.println("low "+low+" high "+high+" mid"+mid);
            return find(nums,target, low, mid-1) || find(nums,target, mid+1,high);
        }        
    }
    private boolean binSearch(int[] n , int t, int l, int h){
        if(h>=l){
            int m = l + (h-l)/2;
            //System.out.println("l "+l+" h "+h+" m "+m);
            if(n[m]==t){
                return true;
            }
            else if(n[m]<t){
                return binSearch(n,t,m+1,h);
            }
            else{
                return binSearch(n,t,l,m-1);
            }
        }
        return false;
    }
}
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/