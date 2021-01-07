class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> m  = new HashMap<>();
        StringBuilder r = new StringBuilder();
        int maxLen = -1;
        for(int i =0 ; i<s.length(); i++){
            if(m.get(s.charAt(i)) == null){
                r.append(s.charAt(i));
                m.put(s.charAt(i),i);
            }
            else {
                if(maxLen < r.toString().length()){
                    maxLen = r.toString().length();
                }
                r = new StringBuilder();
                i = m.get(s.charAt(i));
                m = new HashMap<>();
            }
        }
        if(maxLen < r.toString().length()){
            maxLen = r.toString().length();
        }
        return maxLen;
    }
}
//https://leetcode.com/problems/longest-substring-without-repeating-characters/