class Solution {
    public String minRemoveToMakeValid(String s) {
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                start++;
            }
            else if(s.charAt(i) == ')'){
                end++;
            }
        }
        //System.out.println(start + " " + end);
        int st = 0;
        int e = end;
        StringBuilder r = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(e>0){
                    r.append('(');
                    st++;
                    e--;
                }
                start--;
            }
            else if(s.charAt(i) == ')'){
                if(st>0){
                    r.append(')');
                    st--;
                }
                else{
                    e--;
                }
                end--;
            }
            else{
                r.append(s.charAt(i));
            }
        }
        return r.toString();
    }
}
//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
