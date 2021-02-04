class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int a : nums){
            m.put(a, m.getOrDefault(a,0)+1);
        }
        int max = 0;
        int c = 0;
        int low = 0;
        int high = 0;
        for(int a: nums){
            c = m.get(a);
            low = m.getOrDefault(a-1,0);
            high = m.getOrDefault(a+1,0);
            if(low > 0 && low+c > max){
                max = low+c;
            }
            if(high > 0 && high+c > max){
                max = high+c;
            }                
            c--;
            m.put(a, c);
        }
        return max;
    }
}
//https://leetcode.com/problems/longest-harmonious-subsequence/
