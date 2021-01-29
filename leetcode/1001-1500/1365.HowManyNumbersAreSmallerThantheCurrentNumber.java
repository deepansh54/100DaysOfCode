class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] s = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int c = 0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i]){
                    c++;
                }
            }
            s[i] = c;
        }
        return s;
    }
}
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
