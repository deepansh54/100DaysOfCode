class Solution {
    //Heap's Algorithm
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        permute(nums, nums.length, result);
        
        return new ArrayList<>(result);
    }
    private void permute(int[] nums, int n, HashSet<List<Integer>> result){
        if(n == 1){
            result.add(IntStream.of(nums).boxed().collect(Collectors.toList()));
        }
        else{
            permute(nums, n-1, result);
            for(int i=0;i<n-1;i++){
                if(n%2!=0){
                    int swapVal = nums[0];
                    nums[0] = nums[n-1];
                    nums[n-1] = swapVal;
                }
                else{
                    int swapVal = nums[i];
                    nums[i] = nums[n-1];
                    nums[n-1] = swapVal;
                }
                permute(nums, n-1, result);
            }
        }
    }
}
//https://leetcode.com/problems/permutations-ii/