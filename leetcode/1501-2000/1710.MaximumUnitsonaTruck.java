class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for (int i=0;i<boxTypes.length;i++){
            m.put(boxTypes[i][1], m.getOrDefault(boxTypes[i][1],0)+boxTypes[i][0]);
        }
        int size = 0;
        int maxUnits = 0;
        for(Map.Entry<Integer,Integer> e : m.descendingMap().entrySet()){
            if((size+e.getValue())<truckSize){
                //System.out.println(e);
                size+=e.getValue();
                maxUnits+=(e.getKey()*e.getValue());
                //System.out.println(size);
                //System.out.println(maxUnits);
            }
            else{
                //System.out.println(e);
                int diff = truckSize-size;
                size=truckSize;;
                maxUnits+=(diff*e.getKey());
                //System.out.println(size);
                //System.out.println(maxUnits);
                break;
            }
        }
        return maxUnits;
    }
}
//https://leetcode.com/problems/maximum-units-on-a-truck/