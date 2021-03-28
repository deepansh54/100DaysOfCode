class Solution {
    public int reinitializePermutation(int n) {
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = i;
        }
        int c = 0;  
        boolean reinit = true;
        int[] p = new int[n];
        while(reinit){
            //System.out.println(Arrays.toString(a));

            c++;
            p = new int[n];
            for(int i=0;i<n;i++){
                if(i%2==0){
                    p[i] = a[i/2];
                }
                else{
                    p[i] = a[n/2 + (i-1)/2];
                }
            }
            reinit = check(p,n);
            if(!reinit){
                break;
            }
            else{
                a = p;
            }
        }
        
        return c;
    }
    public boolean check(int[] a, int n){
        for(int i=0;i<n;i++){
            if(a[i]!=i){
                return true;
            }
        }
        return false;
    }
}
//https://leetcode.com/problems/minimum-number-of-operations-to-reinitialize-a-permutation/
