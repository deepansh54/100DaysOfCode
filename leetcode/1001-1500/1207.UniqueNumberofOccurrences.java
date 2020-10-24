class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        Map<Integer,Integer> z = new HashMap<>();
        for(int a : arr){
            m.put(a, m.getOrDefault(a, 0) +1);
        }
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(z.get(e.getValue()) != null){
                return false;
            }
            else{
                z.put(e.getValue(), 1);
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/unique-number-of-occurrences/