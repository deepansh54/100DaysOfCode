class Solution {
    public boolean isHappy(int num) {
        Map<Long,Boolean> m =new HashMap<>();
        long n = num;
        long k = n;
        while(k!=1){
            k=0;
            while(n>0){
                k+= ((n%10)*(n%10));
                n/=10;
            }
            if(m.getOrDefault(k,false)){
                break;
            }
            else{
                m.put(k, true);
            }
            n=k;
        }
        return k==1;
    }
}
//https://leetcode.com/problems/happy-number/
