class Solution {
    public int longestMountain(int[] A) {
        int length = 0;
        int maxLong = 0;
        boolean increasing = false;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1]){
                if(length == 0){
                    length=2;
                    increasing = true;
                }
                else if(increasing){
                    length+=1;
                }
                else{
                    if(length>maxLong){
                        maxLong = length;
                    }
                    if(A.length - i < maxLong){
                        break;
                    }
                    length = 2;
                    increasing = true;
                }
            }
            else if(A[i]<A[i-1]){
                if(length == 0){
                    increasing = false;
                }
                else{
                    increasing = false;
                    length+=1;
                }
            }
            else if(length>0) {
                if(length>maxLong && !increasing){
                    maxLong = length;
                }
                length = 0;
                if(A.length - i < maxLong){
                    break;
                }
            }
            else{
                if(A.length - i < maxLong){
                    break;
                }
            }
        }
        if(length>maxLong && !increasing){
            maxLong = length;
        }
        return maxLong >= 3 ? maxLong : 0;
    }
}
//https://leetcode.com/problems/longest-mountain-in-array/