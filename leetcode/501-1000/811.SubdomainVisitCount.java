class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> m = new HashMap<>();
        int i =-1;
        for(String domain : cpdomains){
            String[] s = domain.split(" ");
            Integer val = Integer.parseInt(s[0]);
            while(!s[1].equals("")){
                m.put(s[1], m.getOrDefault(s[1],0)+val);
                i = s[1].indexOf(".");
                if(i!=-1){
                    s[1] = s[1].substring(i+1);
                }
                else{
                    s[1] = "";
                }
            }
            
        }
        List<String> r = new ArrayList<>();
        for(Map.Entry e : m.entrySet()){
            r.add(String.valueOf(e.getValue())+" "+e.getKey());
        }
        return r;
    }
}
//https://leetcode.com/problems/subdomain-visit-count/