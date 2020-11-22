class Solution {
    public boolean judgeCircle(String moves) {
        int[] a = new int[86];
        for(int move : moves.toCharArray()){
            a[move]++;
        }
        if(a['U']!=a['D'] || a['L'] != a['R']){
            return false;
        }
        return true;
    }
}
//https://leetcode.com/problems/robot-return-to-origin/