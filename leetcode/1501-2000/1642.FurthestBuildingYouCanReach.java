class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        if(ladders >= heights.length-1 ){
            return heights.length-1;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        int i = 0;
        int k = ladders;
        for(; k>0 && i<heights.length-1; i++){
            int diff = heights[i+1]-heights[i];
            if( diff > 0){
                q.offer(diff);
                k--;
            }
        }
        int sum = 0;
        for(; i<heights.length-1; i++){
            int diff = heights[i+1]-heights[i];
            if( diff > 0){
                q.offer(diff);
                sum+=q.poll();
                if(sum>bricks){
                    return i;
                }
            }
        }
        return i;
    }
}
//https://leetcode.com/problems/furthest-building-you-can-reach/
