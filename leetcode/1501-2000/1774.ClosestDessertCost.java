class Solution {
    int closest = -1;
    int closestDiff = Integer.MAX_VALUE;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int cost = 0;
        int[][] t = new int[target+1][toppingCosts.length];
        for(int i = 0; i< baseCosts.length && closestDiff != 0; i++){
            cost = target - baseCosts[i];
            if(cost == 0){
                return target;
            }
            else if(cost > 0) {
                getCost(toppingCosts, toppingCosts.length, baseCosts[i], target);
            }
            else{
                int diff = Math.abs(target-baseCosts[i]);
                if(diff < closestDiff){
                    closestDiff=diff;
                    closest = baseCosts[i];
                }
                else if(diff == closestDiff){
                    closest = closest <= baseCosts[i] ? closest : baseCosts[i];
                }
            }
        }
        return closest;
    }
    public void getCost(int[] t , int n, int sum, int target){
        if(n<0 || closestDiff == 0){
            return;
        }
        int diff = Math.abs(target-sum);
        if(diff < closestDiff){
            closestDiff=diff;
            closest = sum;
        }
        else if(diff == closestDiff){
            closest = closest <= sum ? closest : sum;
        }
        //System.out.println("------------");
        //System.out.println("n="+n+" sum="+sum+" diff="+diff);
        //System.out.println("c="+closest+" d="+closestDiff);
        if(n>0){ 
            getCost(t, n-1, sum, target);
            getCost(t, n-1, sum + t[n-1], target);
            getCost(t, n-1, sum + 2*t[n-1], target);
        }
    }
}
//https://leetcode.com/problems/closest-dessert-cost/
