class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0){
            return m*n;
        }
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            if(ops[i][0] <= x){
                x = ops[i][0];
            }
            if(ops[i][1] <= y){
                y = ops[i][1];
            }
        }
        return x*y;
    }
}
//https://leetcode.com/problems/range-addition-ii/
