class Solution {
    public int secondHighest(String s) {
        int[] a = new int[12];
        for(char c : s.toCharArray()){
            if(c <= '9'){
                a[c - '0']++;
            }
        }
        boolean found = false;
        for(int i =9 ; i>=0; i--){
            if(!found && a[i]> 0){
                found = true;
            }
            else if(found && a[i] > 0){
                return i;
            }
        }
        return -1;
    }
}
//https://leetcode.com/problems/second-largest-digit-in-a-string/
