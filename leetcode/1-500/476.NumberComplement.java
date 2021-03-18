class Solution {
    public int findComplement(int num) {
        StringBuilder p = new StringBuilder(Integer.toBinaryString(num));
        //System.out.println(p);
        for(int i=0; i<p.length();i++){
            if(p.charAt(i) == '1'){
                p.setCharAt(i,'0');
            }
            else{
                p.setCharAt(i,'1');
            }
        }
        return Integer.parseInt(p.toString(),2);
    }
}
//https://leetcode.com/problems/number-complement/
