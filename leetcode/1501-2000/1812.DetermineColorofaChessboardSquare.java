class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(((coordinates.charAt(0) - 'a') % 2) == 0){
            if(((coordinates.charAt(1) - '0') % 2) == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(((coordinates.charAt(1) - '0') % 2) == 0){
                return false;
            }
            else{
                return true;
            }
        }
    }
}
//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
