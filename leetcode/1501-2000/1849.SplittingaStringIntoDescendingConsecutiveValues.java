class Solution {
    public boolean splitString(String s) {
        //System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        StringBuilder sb = new StringBuilder();
        Long val = 0L;
        List<Long> l = new ArrayList<>();
        int max = s.length()/2 + 1;
        for(int i=0;i<s.length()-1;i++){
            sb.append(s.charAt(i));
            val = Long.parseLong(sb.toString());
            int len = String.valueOf(val).length();
            if(len<=max){
                l = new ArrayList<>();
                if(splitString(s, val, i+1, l) == 1 && l.size()>=1){
                    //System.out.println(l);
                    return true;
                }
            }
            else{
                //System.out.println(l);
                return false;
            }
        }
        return false;
     }
    public int splitString(String s, Long k, int start, List<Long> l) {
        //System.out.println("s="+s+" k="+k+" start="+start+" l="+l);
        if(start>=s.length()){
            return 1;
        }
        StringBuilder sb = new StringBuilder();
        String tmp = null;
        int len = String.valueOf(k).length();
        Long v = 0L;
        for(int i=start;i<s.length();i++){
            sb.append(s.charAt(i));
            tmp = sb.toString();
            v = Long.parseLong(tmp);
            while(v==0L){
                i++;
                if(i<s.length()){
                    sb.append(s.charAt(i));
                    tmp = sb.toString();
                    v = Long.parseLong(tmp);
                }
                else{
                    break;
                }
            }
            int p = String.valueOf(v).length();
            if(p<=len){
                if(v.equals(k-1)){
                    l.add(v);
                    return splitString(s, v, i+1, l);
                }
            }
            else{
                break;
            }
        }
        return -1;
     }
}
//https://leetcode.com/problems/splitting-a-string-into-descending-consecutive-values/
