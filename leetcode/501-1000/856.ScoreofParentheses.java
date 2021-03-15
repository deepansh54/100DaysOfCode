class Solution {
    public int scoreOfParentheses(String S) {
    Stack<Integer> results = new Stack<>();
        int out = 0;
        
        for (char c : S.toCharArray()){
            if (c == '('){
                results.push(out);
                out = 0;
            }
            else{
                out = results.pop() + Math.max(out * 2, 1);
            }
        }
        return out;
    }
}
//https://leetcode.com/problems/score-of-parentheses/
