class Solution {
    public int maximumScore(int a, int b, int c) {
        int x=0; int y=0;int z=0;
        if(a>=b){
            if(a>=c){
                return getScore(a,b,c);
            }
            else{
                return getScore(c,a,b);
            }
        }
        else{
            if(b>=c){
                return getScore(b,a,c);
            }
            else{
                return getScore(c,a,b);
            }
        }
    }
    public int getScore(int a, int b, int c){
        if(a >= b+c ){
            return b+c;
        }
        else{
            return a + (b+c-a)/2;
        }
    }
}
//https://leetcode.com/problems/maximum-score-from-removing-stones/
