class Solution {
    public boolean hasAllCodes(String s, int k) {
        int p = (int)Math.pow(2,k) -1;
        if(p>s.length()){
            return false;
        }
        int[] a = new int[p+1];
        StringBuilder t = new StringBuilder(s.substring(0,k));
        a[Integer.parseInt(t.toString(),2)]++;
        for(int i=k ;i<s.length();i++){
            t.deleteCharAt(0);
            t.append(s.charAt(i));
            a[Integer.parseInt(t.toString(),2)]++;
        }
        for(int i=0;i<p+1;i++){
            if(a[i] == 0){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
