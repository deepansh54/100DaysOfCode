class Solution {
    public int maxDistToClosest(int[] seats) {
        int max = 1;
        int lastIndex = -1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                if(lastIndex == -1){
                    max = i;
                }
                else if((i-lastIndex)/2 > max){
                    max = (i-lastIndex)/2;
                }
                lastIndex = i;
            }
        }
        if(seats.length -1 -lastIndex > max){
            max = seats.length -1 -lastIndex;
        }
        return max;
    }
}
//https://leetcode.com/problems/maximize-distance-to-closest-person/