class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n-1, a=m-1, b=n-1;
        for(; a>=0 && b>=0;){
            if(nums1[a]>=nums2[b]){
                nums1[i] = nums1[a];
                a--;
            }
            else{
                nums1[i] = nums2[b];
                b--;
            }
            i--;
        }
        while(a>=0){
            nums1[i] = nums1[a];
            a--;
            i--;
        }
        while(b>=0){
            nums1[i] = nums2[b];
            b--;
            i--;
        }
    }
}
//https://leetcode.com/problems/merge-sorted-array/
