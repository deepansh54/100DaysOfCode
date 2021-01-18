class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int a : nums){
            if(a<=k)m.put(a,m.getOrDefault(a,0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()<=0){
                continue;
            }
            int c = m.getOrDefault(k-e.getKey(),0);
            if(c>0){
                if(c<=e.getValue()){
                    if(k-e.getKey() == e.getKey()){
                        count+=e.getValue()/2;
                        m.put(e.getKey(),e.getValue()-e.getValue()/2);
                    }
                    else{
                        count+=c;
                        m.put(k-e.getKey(),0);
                        m.put(e.getKey(),e.getValue()-c);
                    }
                    
                    //System.out.println(count);
                }
                else{
                    count+=e.getValue();
                    m.put(k-e.getKey(),c-e.getValue());
                    m.put(e.getKey(),0);                 
                }
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/max-number-of-k-sum-pairs/
