class Solution {
    public int singleNumber(int[] nums) {
        int n1 = 0;
        int n2 = 0;
        int n3=0;
        for(int p : nums){
            if(p>0){
                n1^=p;
            }
            else if(p<0){
                n2^=(-1*p);
            }
            else{
                n3++;
            }
        }
        if(n3 == 1){
            return 0;
        }
        if(n1!=0){
            return n1;
        }
        else{
            return -1*n2;
        }
    }
}
//https://leetcode.com/problems/single-number/
