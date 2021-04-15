class Solution {
    int[] f = new int[31];
    public int fib(int n) {
        f[0] = 0;
        f[1] = 1;
        return fibo(n);
    }
    public int fibo(int n){
        if(n<=1){
            return f[n];
        }
        if(f[n-1]==0){
            f[n-1] = fibo(n-1);
        }
        if(f[n-2]==0){
            f[n-2] = fibo(n-2);
        }
        f[n] = f[n-1] + f[n-2];
        return f[n];
    }
}
//https://leetcode.com/problems/fibonacci-number/
