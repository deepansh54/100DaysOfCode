class Solution {
    public int romanToInt(String s) {
        int[] r = new int[100];
        r['I'] = 1;
        r['V'] = 5;
        r['X'] = 10;
        r['L'] = 50;
        r['C'] = 100;
        r['D'] = 500;
        r['M'] = 1000;
        char a = ' ';
        char b = ' ';
        int k = 0;
        for(int i=0;i<s.length();i++){
            a = s.charAt(i);
            
            if(i == s.length()-1){
                k+=r[a];
                break;
            }
            
            b = s.charAt(i+1);
            if(r[a] < r[b]){
                k+=r[b]-r[a];
                i++;
            }
            else{
                k+=r[a];
            }
        }
        
        return k;
    }
}
//https://leetcode.com/problems/roman-to-integer/
