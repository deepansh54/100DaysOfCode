class Solution {
    public double averageWaitingTime(int[][] customers) {
        for(int i=1; i< customers.length; i++){
            if(customers[i][0]==customers[i-1][0]){
                customers[i][1]+=customers[i-1][1];
            }
            else if(customers[i-1][0]+customers[i-1][1] > customers[i][0] ){
                customers[i][1]+=(customers[i-1][0]+customers[i-1][1]-customers[i][0]);
            }
        }
        double totalWatingtime = 0.0;
        for(int i=0; i< customers.length; i++){
            totalWatingtime+=customers[i][1];
        }
        return totalWatingtime/customers.length;
    }
}
//https://leetcode.com/problems/average-waiting-time/