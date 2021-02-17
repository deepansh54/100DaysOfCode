class Solution {
    public List<Integer> partitionLabels(String S) {
        Map<Character, Integer> m = new HashMap<>();
        for(int i=0; i<S.length(); i++){
            m.put(S.charAt(i), i);
        }
        int p=0;
        int n = 0;
        int k = 0;
        List<Integer> r = new ArrayList<>();
        for(int i=0 ;i<S.length(); i++){
            k = m.get(S.charAt(i));
            if(k>=n){
                n=k;
            }
            if(n==i){
                r.add(n+1-p);
                p=n+1;
                n=0;
            }
        }
        return r;
    }
}
//https://leetcode.com/problems/partition-labels/
