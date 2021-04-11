class Solution {
    public int findTheWinner(int n, int k) {
        if(k==1 || n==1){
            return n;
        }
        ArrayDeque<Integer> a = new ArrayDeque<>();
        for(int i=1;i<=n;i++){
          a.offerLast(i);  
        }

        while(a.size()>1){
            for(int i=1;i<k;i++){
                a.offerLast(a.pollFirst());
            }
            a.pollFirst();
        }
        
        return a.pollFirst();
    }
}
//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
