class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];
        int xor = 0;
        int m = (1<<maximumBit) -1;
        //System.out.println(Integer.toBinaryString(m));
        int i = nums.length-1;
        for(int n : nums){
            xor^=n;
            
            ans[i] = m ^ xor;
            i--;
        }
        return ans;
    }
}
//https://leetcode.com/problems/maximum-xor-for-each-query/
