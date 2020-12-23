class Solution {

    private Map<String, Boolean> memo = new HashMap<>();

    public List<List<String>> partition(String s) {

        Set<List<String>> r = new HashSet<>();

        if(s.length() == 1){
            List<String> t = new ArrayList<>();
            t.add(s);
            r.add(t);
            return new ArrayList<List<String>>(r);
        }

        List<List<String>> p = partition(s.substring(1));

        for(List<String> u : p){

            StringBuilder v = new StringBuilder();
            v.append(s.charAt(0));
            u.add(0,v.toString());
            r.add(u);
            
            for(int i=1;i<u.size();i++){

                v.append(u.get(i));
                String w = v.toString();

                if(itIsPalindrome(w)){
                    memo.put(w,true);
                    List<String> x = new ArrayList<>();
                    x.add(w);
                    x.addAll(u.subList(i+1, u.size()));
                    r.add(x);
                }
                else{
                    memo.put(w,false);
                }

            }
        }
        return new ArrayList<List<String>>(r);
    }
    public boolean itIsPalindrome(String s){
        if(memo.containsKey(s)) return memo.get(s);
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/palindrome-partitioning/

