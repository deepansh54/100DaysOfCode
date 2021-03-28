class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> m = new HashMap<>();
        for(List<String> si : knowledge){
            m.put(si.get(0), si.get(1));
        }
        StringBuilder r = new StringBuilder("");
        StringBuilder key = new StringBuilder("");
        boolean keyFound = false;
        for(char c : s.toCharArray()){
            if(c == '('){
                keyFound = true;
            }
            else if(c == ')'){
                r.append(m.getOrDefault(key.toString(), "?"));
                key = new StringBuilder();
                keyFound =false;
            }
            else if(keyFound){
                key.append(c);
            }
            else{
                r.append(c);
            }
        }
        return r.toString();
    }
}
//https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/
