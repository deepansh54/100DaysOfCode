class Solution {
    public int sumOfUnique(int[] nums) {
        int[] s = new int[101];
        for(int a : nums){
            s[a]++;
        }
        int sum = 0;
        for(int i=1;i<101;i++){
            if(s[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}
//https://leetcode.com/problems/sum-of-unique-elements/
