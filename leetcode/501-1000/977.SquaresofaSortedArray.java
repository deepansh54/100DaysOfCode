class Solution {
    public int[] sortedSquares(int[] nums) {
        int lastNegativeIndex = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                lastNegativeIndex = i;
            }
            nums[i]*=nums[i];
        }
        if(lastNegativeIndex == -1){
            return nums;
        }
        int[] sorted= new int[nums.length];
        int i = lastNegativeIndex; 
        int j = lastNegativeIndex+1;
        int k = 0;
        while(i>=0 && j<nums.length){
            if(nums[i]<=nums[j]){
                sorted[k] = nums[i];
                i--;
            }
            else{
                sorted[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i>=0){
            sorted[k] = nums[i];
            i--;
            k++;
        }
        while(j<nums.length){
            sorted[k] = nums[j];
            j++;
            k++;
        }
        return sorted;
    }
}
//https://leetcode.com/problems/squares-of-a-sorted-array/