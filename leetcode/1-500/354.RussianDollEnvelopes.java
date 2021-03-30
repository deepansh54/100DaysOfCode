class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        //System.out.println("~~~~~~~~~~~~");

        Arrays.sort(envelopes, (p,q) -> {
            int a =((Integer)p[0]).compareTo(((Integer)q[0]));
            if(a==0){
                return ((Integer)p[1]).compareTo(((Integer)q[1]));
            }
            return a;
        });
        int[] dp = new int[envelopes.length];
        int rdel = 1;
        for(int i=envelopes.length-1;i>=0;i--){
            //System.out.println(Arrays.toString(envelopes[i]));
            dp[i] = Math.max(dp[i],1);
            for(int j=i-1;j>=0;j--){
                if(envelopes[j][0]<envelopes[i][0] && envelopes[j][1]<envelopes[i][1]){
                    dp[j] = Math.max(dp[j],dp[i]+1);
                    rdel = Math.max(dp[j],rdel);
                }
            }
            //System.out.println("--dp--");
            //System.out.println(Arrays.toString(dp));

        }    
        return rdel;
    }
}
/*
TestCases
[[5,4],[6,4],[6,7],[2,3]]
[[1,1],[1,1],[1,1]]
[[7,6],[6,6],[5,6],[2,3]]
[[46,89],[50,53],[52,68],[72,45],[77,81]]
[[2,100],[3,200],[4,300],[5,500],[5,400],[5,250],[6,370],[6,360],[7,380]]
*/
//https://leetcode.com/problems/russian-doll-envelopes/