class Solution {
    public int maxNiceDivisors(int primeFactors) {
        long mod = 1000000000 + 7;
        long base = 3;
        long divisors = 1;
        long v = primeFactors%3;
        long t = primeFactors/3;
        if(v==1&&t>0){
            t--;
            v+=3;
        }
        //System.out.println("v="+v+" t="+t);
        while(t>0){
            if(t%2!=0){
                divisors= (divisors*base)%mod;
                t--;
            }
            base= (base*base)%mod;
            t/=2;
        }
        if(v!=0){
            divisors = (divisors * v) % mod;
        }
        //System.out.println("divisors="+divisors);
        return (int) divisors;
    }
}
//https://leetcode.com/problems/maximize-number-of-nice-divisors/
