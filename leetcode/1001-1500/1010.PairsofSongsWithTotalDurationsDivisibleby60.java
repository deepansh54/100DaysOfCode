class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int max = -1;
        int min = 501;
        List<Integer> l = null;
        Map<Integer,List<Integer>> p = new HashMap<>();
        for(int i=0;i<time.length;i++){
            if(time[i]>max){
                max = time[i];
            }
            if(time[i]<min){
                min = time[i];
            }
            l = p.getOrDefault(time[i], new ArrayList<Integer>());
            l.add(i);
            p.put(time[i],l);
        }
        //System.out.println(p);

        Map<Integer,List<Integer>> m = new HashMap<>();
        for(int i=min;i<=max;i++){
            for(int j=i;j<=max;j++){
                if((i+j)%60==0){
                    l = m.getOrDefault(i, new ArrayList<Integer>());
                    l.add(j);
                    m.put(i,l);
                    if(i!=j){
                        l = m.getOrDefault(j, new ArrayList<Integer>());
                        l.add(i);
                        m.put(j,l);
                    }
                }
            }
        }
        //System.out.println(m);
        int count = 0;
        List<Integer> n = null;
        for(int i=0;i<time.length;i++){
            //System.out.println("i="+i+" time="+time[i]);
            n = m.get(time[i]);
            if(n!=null){
                //System.out.println("n="+n);
                for(Integer v : n){
                    l = p.get(v);
                    //System.out.println("l="+l);
                    if(l!=null){
                        for(Integer r : l){
                            if(r>i){
                                count++;
                                //System.out.println("count="+count);
                                
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/