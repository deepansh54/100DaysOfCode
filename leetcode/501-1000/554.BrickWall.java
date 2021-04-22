class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer,Integer> m = new HashMap<>();
        int sum = 0;
        int  p = 0;
        int max = 0;
        for(List<Integer> w : wall){
            sum=0;
            for(int i=0; i<w.size()-1;i++){
                sum+=w.get(i);
                p = m.getOrDefault(sum,0)+1;
                if(p>max){
                    max=p;
                }
                m.put(sum, p);
            }
        }
        return wall.size()-max;
    }
}
//https://leetcode.com/problems/brick-wall/
