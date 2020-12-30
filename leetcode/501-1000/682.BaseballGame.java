class Solution {
    public int calPoints(String[] ops) {
        int[] scores = new int[ops.length];
        int sum=0;
        for(int i=0,j=0;i<ops.length;i++){
            switch(ops[i]){
                case "+":
                    scores[j] = scores[j-1]+scores[j-2];
                    sum+=scores[j];
                    j++;
                    break;
                case "D":
                    scores[j] = 2*scores[j-1];
                    sum+=scores[j];
                    j++;
                    break;
                case "C":
                    sum-=scores[j-1];
                    scores[j-1] = 0;
                    j--;
                    break;
                default:
                    scores[j] = Integer.parseInt(ops[i]);
                    sum+=scores[j];
                    j++;
            }
        }
        return sum;
    }
}
//https://leetcode.com/problems/baseball-game/