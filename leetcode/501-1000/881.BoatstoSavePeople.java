class Solution {
    public int numRescueBoats(int[] people, int limit) {
        TreeMap<Integer,Integer> m = new TreeMap<>();
        for(int p: people){
            m.put(p,m.getOrDefault(p,0)+1);
        }
        int boats = 0;
        while(!m.isEmpty()){
            Map.Entry<Integer,Integer> lastEntry = m.lastEntry();
            if(lastEntry.getValue()-1==0){
                m.remove(lastEntry.getKey());
            }
            else{
                m.put(lastEntry.getKey(),lastEntry.getValue()-1);
            }
            lastEntry = m.floorEntry(limit-lastEntry.getKey());
            if(lastEntry!=null){
                if(lastEntry.getValue()-1==0){
                    m.remove(lastEntry.getKey());
                }
                else{
                    m.put(lastEntry.getKey(),lastEntry.getValue()-1);
                }
                boats++;
            }
            else{
                boats++;
            }
        }
        return boats;
    }
}
//https://leetcode.com/problems/boats-to-save-people/