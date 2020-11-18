class Solution {
    public int[][] merge(int[][] intervals) {
        Map<Integer,Integer> m = new TreeMap<>();
        
        for(int i=0; i<intervals.length; i++){
            m.put(intervals[i][0], m.getOrDefault(intervals[i][0],0)+1);
            m.put(intervals[i][1], m.getOrDefault(intervals[i][1],0)-1);
        }
        int s=-1;
        int len = 0;
        for(Map.Entry<Integer,Integer> e: m.entrySet()){
            if(s==-1){
                intervals[len][0] = e.getKey();
                s=0;
            }
            s+=e.getValue();
            if(s==0){
                intervals[len][1] = e.getKey();
                s=-1;
                len++;
            }
        }
        int[][] result = new int[len][2];
        for(int i=0;i<len;i++){
            result[i][0] = intervals[i][0];
            result[i][1] = intervals[i][1];
        }
        return result;
    }
}
//https://leetcode.com/problems/merge-intervals/