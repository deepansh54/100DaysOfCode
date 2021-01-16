class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>(k+1);
        for(int i=0;i<k;i++){
            p.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(p.peek()<nums[i]){
                p.add(nums[i]);
                p.poll();
            }
        }
        return p.poll();
    }
}
//https://leetcode.com/problems/kth-largest-element-in-an-array/
