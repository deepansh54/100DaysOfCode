class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> a = new ArrayDeque<>();
        Map<Character,Character> m = new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');
        for(char c : s.toCharArray()){
            if(m.containsKey(c)){
                if(!m.get(c).equals(a.pollLast())){
                    return false;
                }
            }
            else{
                a.offerLast(c);
            }
        }
        return a.isEmpty();        
    }
}
//https://leetcode.com/problems/valid-parentheses/
