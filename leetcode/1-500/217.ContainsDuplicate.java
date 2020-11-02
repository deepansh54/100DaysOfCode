class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> m = new HashMap<>() ;
        for(int n : nums){
            if(m.getOrDefault(n, false)){
                return true;
            }
            else{
                m.put(n, true);
            }
        }
        return false;
    }
}
//https://leetcode.com/problems/contains-duplicate/