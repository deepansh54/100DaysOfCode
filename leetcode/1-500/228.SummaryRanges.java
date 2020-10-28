class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for(int i=0 ; i<nums.length;i++){
            if(i+1 < nums.length && nums[i] == nums[i+1]-1){
                if(s.lastIndexOf("->") < 0){
                    s.append(String.valueOf(nums[i]));
                    s.append("->");
                }
            }
            else{
                s.append(String.valueOf(nums[i]));
                result.add(s.toString());
                s = new StringBuilder();
            }
        }
        return result;
    }
}
//https://leetcode.com/problems/summary-ranges/