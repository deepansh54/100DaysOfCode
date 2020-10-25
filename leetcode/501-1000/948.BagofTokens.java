class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int score = 0;
        for(int i=0, j=tokens.length-1; i<=j;){
            if(tokens[i]<=P){
                P-=tokens[i];
                score++;
                i++;
            }
            else if(score>0 && tokens[j]>tokens[i]){
                score--;
                P+=tokens[j];
                j--;
            }
            else{
                break;
            }
        }
        return score;
    }
}
//https://leetcode.com/problems/bag-of-tokens/