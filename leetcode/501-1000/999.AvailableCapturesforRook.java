class Solution {
    public int numRookCaptures(char[][] board) {
        int count = 0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j] == 'R'){
                    for(int k=j+1;k<8 && board[i][k]!='B';k++){
                        if(board[i][k] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for(int k=j-1;k>=0 && board[i][k]!='B';k--){
                        if(board[i][k] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for(int k=i+1;k<8 && board[k][j]!='B';k++){
                        if(board[k][j] == 'p') {
                            count++;
                            break;
                        }
                    }
                    for(int k=i-1;k>=0 && board[k][j]!='B';k--){
                        if(board[k][j] == 'p') {
                            count++;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/available-captures-for-rook/