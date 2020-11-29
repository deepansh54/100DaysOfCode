class Solution {
    private int[] visited = new int[600000];
    public boolean canReach(int[] arr, int start) {
        if(start<0 || start>=arr.length || visited[start]==1){
            return false;
        }
        visited[start]=1;
        if(arr[start]==0){
            return true;
        }
        return canReach(arr, start+arr[start]) || canReach(arr, start-arr[start]);
    }
}
//https://leetcode.com/problems/jump-game-iii/