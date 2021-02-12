class Solution {
    public int numberOfSteps (int num) {
        int count = 0;
        while(num>0){
            if((num & 1) != 1){
                num/=2;
            }
            else{
                num-=1;
            }
            count++;
        }
        return count;
    }
}
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
