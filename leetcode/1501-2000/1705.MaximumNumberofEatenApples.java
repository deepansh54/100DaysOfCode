class Solution {
    
    public int eatenApples(int[] apples, int[] days) {
        int total = 0;
        int maxDays = -1;
        TreeMap<Integer,Integer> m = new TreeMap<>();
        for(int i=0;i<apples.length;i++){
            if(i+days[i]>maxDays)maxDays=i+days[i];
        }
        for(int i=0;i<maxDays;i++){
            if(i<apples.length && apples[i]!=0){
                m.put((i+days[i]-1), m.getOrDefault(i+days[i]-1, 0)+apples[i]);    
            }
            //System.out.println("i = "+i+" Initial-> " + m);
            Map.Entry<Integer,Integer> p = m.firstEntry();

            while(p!=null && p.getKey()<i){
                m.remove(p.getKey());
                p = m.firstEntry();
            }
            if(m.isEmpty() || p ==null){
                continue;
            }
            if(p.getValue()>0){
                
                if(p.getValue()-1 == 0){
                    m.remove(p.getKey());
                }
                else{
                    m.put(p.getKey(),p.getValue()-1);
                }
                
                total++;
            }
            //System.out.println(m);
        }
        
        return total;
    }
}
//https://leetcode.com/problems/maximum-number-of-eaten-apples/