class Solution {
    public int removeDuplicates(int[] nums) {
        int moveBack = 0;
        int c= 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                c++;
                if(c>=2){
                    moveBack++;
                }
            }
            else{
                c=0;
            }
            nums[i-moveBack] = nums[i];
        }
        return nums.length-moveBack;
    }
}
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/