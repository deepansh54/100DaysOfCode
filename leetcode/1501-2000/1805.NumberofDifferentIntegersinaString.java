class Solution {
    public int numDifferentIntegers(String word) {
        Map<String,Boolean> m =new HashMap<>();
        StringBuilder r = new StringBuilder("");
        for(char c : word.toCharArray()){
            if(c <= '9'){
                r.append(c);
            }
            else if(r.length()!=0){
                while(r.charAt(0) == '0' && r.length()>1){
                    r.deleteCharAt(0);
                }
                m.put(r.toString(),true);
                r = new StringBuilder("");
            }
        }
        if(r.length()!=0){
            while(r.charAt(0) == '0' && r.length()>1){
                r.deleteCharAt(0);
            }
            m.put(r.toString(),true);
        }
        return m.entrySet().size();
    }
}
//https://leetcode.com/problems/number-of-different-integers-in-a-string/
