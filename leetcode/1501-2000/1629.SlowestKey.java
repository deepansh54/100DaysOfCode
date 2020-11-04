class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char maxChar = keysPressed.charAt(0);
        int maxDuration = releaseTimes[0];
        int duration = 0;
        for(int i=1; i<releaseTimes.length; i++){
            duration = releaseTimes[i] - releaseTimes[i-1];
            if(duration>maxDuration){
                maxDuration = duration;
                maxChar = keysPressed.charAt(i);
            }
            else if(duration == maxDuration && keysPressed.charAt(i) > maxChar){
                maxChar = keysPressed.charAt(i);
            }
        }
        return maxChar;
    }
}
//https://leetcode.com/problems/slowest-key/