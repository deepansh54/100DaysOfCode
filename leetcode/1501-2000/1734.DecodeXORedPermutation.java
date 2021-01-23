class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int s = encoded[0];
        //1^n
        for(int i =1 ; i<encoded.length;i++){
            s^=encoded[i];
        }
        for(int i=1;i<=n;i++){
            s^=i;
        }
        int k = (n-1)/2;
        for(int j=1;2*j<n;j++){
            s^=encoded[j*2-1];
        }
        int[] a = new int[n];
        a[n-1] = s;
        for(int i=n-2; i>=0;i--){
            a[i] = encoded[i]^a[i+1];
        }
        return a;
    }
}
//https://leetcode.com/problems/decode-xored-permutation/
