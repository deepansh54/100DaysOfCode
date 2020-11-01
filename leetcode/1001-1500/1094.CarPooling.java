class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] fullTrip = new int[1001];
        for(int[] trip : trips){
            fullTrip[trip[1]]+=trip[0];
            fullTrip[trip[2]]-=trip[0];
        }
        int totalCap = 0;
        for(int loc : fullTrip){
            totalCap+=loc;
            if(totalCap>capacity){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/car-pooling/