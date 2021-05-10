class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int[] a = new int[n+1];
        for(int i=2;i<=n;i++){
            a[i]=1;
        }
        for(int i=2;i*i<n;i++){
            if(a[i]==1){
                a[i*i] = 0;
                for(int j=i;j<=n/i;j++){
                    a[j*i] = 0;
                }
            }
        }
        int count =0;
        for(int i=2;i<n;i++){
            if(a[i]==1){
                count++;
            }
        }
        //System.out.println(Arrays.toString(a));
        return count;
    }
}
//https://leetcode.com/problems/count-primes/
