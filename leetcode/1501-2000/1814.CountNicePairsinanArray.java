class Solution {
    public int countNicePairs(int[] nums) {
        long count = 0;
        long mod = 1000000000 +7;
        Map<Long, Long> m = new HashMap<>();
        for(int i=0;i<nums.length;i++ ){
            long reverse = rev(nums[i]);
            long num = nums[i];
            m.put(num-reverse, m.getOrDefault(num-reverse,0L)+1);
        }
        for(Map.Entry<Long,Long> e : m.entrySet()){
            if(e.getValue()> 1L){
                count = (count + ((e.getValue() * (e.getValue()-1)) / 2) %mod) % mod;
            }            
        }
        return (int) count;
    }
    public long rev (long n){
        long num = 0;
        while(n>0){
            num = (num*10) + (n%10);
            n/=10;
        }
        return num;
    }
}
//https://leetcode.com/problems/count-nice-pairs-in-an-array/
