class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] r = new int[len];
        
        int[] c = new int[len];
        
        int[] s = new int[len];
        
        int cnt = 0;
        int isum = 0;
        for(int i=0;i<len;i++){
            if(boxes.charAt(i) == '1'){
                cnt++;
                isum+=i;
            }
            c[i]=cnt;
            s[i]=isum;
        }
        for(int i=0;i<len;i++){
            if(i+1 < len){
                r[i]+= s[len-1] - s[i] - (c[len-1]-c[i])*i;
            }
            if(i-1 >= 0){
                r[i]+= (c[i-1])*i - s[i-1];
            }
        }
        return r;
        
    }
}
//https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
