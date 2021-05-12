class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        for(int num:nums){
            int n = m.getOrDefault(num,0)+1;
            if(n>(nums.length/2)){
                ans = num;
                break;
            }
            m.put(num,n);
        }
        return ans;
    }
}
//https://leetcode.com/problems/majority-element/
