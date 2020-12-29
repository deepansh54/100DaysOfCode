class Solution {
    public int reachNumber(int target) {
        if(target<0)target*=-1;
        int nearestInteger = Double.valueOf((-1+Math.sqrt(1+4*2*(double)target))/2).intValue();
        int lastIntegralSum = (nearestInteger*(nearestInteger+1))/2;
        if(lastIntegralSum==target){
            return nearestInteger;
        }
        if(target%2==0){
            while(lastIntegralSum%2!=0){
                nearestInteger--;
                lastIntegralSum = (nearestInteger*(nearestInteger+1))/2;
            }
        }
        else{
            while(lastIntegralSum%2==0){
                nearestInteger--;
                lastIntegralSum = (nearestInteger*(nearestInteger+1))/2;
            }
        }
        
        if(nearestInteger%2==0){
            return nearestInteger+3;
        }
        else{
            return nearestInteger+1;
        }
    }
    //below works but with higher time complexity
    Integer minMoves = Integer.MAX_VALUE;
    private void steps(int target, Integer moves, int pos){
        //System.out.println("Target:"+target+" moves:"+moves+" pos:"+pos);
        if(target==0){
            minMoves = 0;
            return;
        }
        if(target > 0 && (target<pos || pos<-1*target)){
            return;
        }
        if(target < 0 && (target>pos || pos>-1*target)){
            return;
        }
        if(target==pos){
            if(moves < minMoves){
                minMoves = moves;
            }
            return;
        }
        moves++;
        if(moves>minMoves){
            return;
        }
        steps(target,moves,pos-moves);
        steps(target,moves,pos+moves);
    }
}
// TestCases
//   -   -     -        -              -                 -
// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 
// 0 1 3 2 3 5 3 5 4 5  4  5  7  5  7  5  7  6  7  6  7  6  7  9
//https://leetcode.com/problems/reach-a-number/