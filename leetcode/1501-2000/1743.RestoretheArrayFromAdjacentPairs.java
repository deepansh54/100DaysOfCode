class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();
        Map<Integer, Integer> start = new HashMap<>();
        
        for(int[] a : adjacentPairs){
            if(start.containsKey(a[0])){
                start.remove(a[0]);
            }
            else{
                start.put(a[0],a[1]);
            }
            if(start.containsKey(a[1])){
                start.remove(a[1]);
            }
            else{
                start.put(a[1],a[0]);
            }
            ArrayList<Integer> a0 = m.getOrDefault(a[0], new ArrayList<>());
            ArrayList<Integer> a1 = m.getOrDefault(a[1], new ArrayList<>());
            a0.add(a[1]);
            a1.add(a[0]);
            m.put(a[0],a0);
            m.put(a[1],a1);
        }
        //System.out.println(m);
        Map.Entry<Integer, Integer> first = start.entrySet().iterator().next();
        int[] ans = new int[adjacentPairs.length+1];
        ans[0] = first.getKey();
        ans[1] = first.getValue();
        for(int i = 1 ;i <adjacentPairs.length ; i++){
            ArrayList<Integer> a = m.get(ans[i]);
            if( a.get(0) != ans[i-1] ){
                ans[i+1] = a.get(0);
            }
            else{
                ans[i+1] = a.get(1);
            }
        }
        return ans;
    }
}
//https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/
