class Solution {
    String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> result = new HashSet<String>();
        for(String word : words){
            StringBuilder s = new StringBuilder();
            for(char a : word.toCharArray()){
                s.append(m[a-97]);
            }
            result.add(s.toString());
        }
        return result.size();
    }
}
//https://leetcode.com/problems/unique-morse-code-words/