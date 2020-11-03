class Solution {
    public int maxPower(String s) {
        int maxPower = 1, power =1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                power++;
            }
            else{
                if(power>maxPower){
                    maxPower = power;
                }
                power = 1;
            }
        }
        if(power>maxPower){
            maxPower = power;
        }
        return maxPower;
    }
}
//https://leetcode.com/problems/consecutive-characters/