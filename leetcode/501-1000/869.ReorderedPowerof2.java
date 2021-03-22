class Solution {
    public boolean reorderedPowerOf2(int N) {
        long n = N;
        long p = 1;
        String s =  String.valueOf(N);
        int len = s.length();
        String sp = getArrStr(s);
        String p2 = null;
        for(int i = 0 ; i<30 && p<=10*n; i++){
            p2 = String.valueOf(p);
            if(p2.length() == len && sp.equals(getArrStr(p2))){
                return true;
            }
            p = p<<1;
            //System.out.println(p);
        }
        return false;        
    }
    private String getArrStr(String s){
        int[] a = new int[10];
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            a[c-'0']++;
        }
        for(int i=0;i<9;i++){
            sb.append(a[i]);
        }
        return sb.toString();
    }
}
//https://leetcode.com/problems/reordered-power-of-2/
