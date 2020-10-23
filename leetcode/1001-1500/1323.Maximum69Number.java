class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        StringBuilder r = new StringBuilder();
        boolean done = false;
        for(char c : s.toCharArray()){
            if(!done && c != '9'){
                r.append('9');
                done = true;
            }
            else{
                r.append(c);
            }
        }
        return Integer.parseInt(r.toString());
    }
}
//https://leetcode.com/problems/maximum-69-number/