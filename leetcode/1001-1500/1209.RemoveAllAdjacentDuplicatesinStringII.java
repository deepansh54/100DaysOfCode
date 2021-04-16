class Solution {
    public String removeDuplicates(String s, int k) {

        Stack<Integer> st = new Stack<>();
        Stack<Character> sb = new Stack<>();
        int t = k;
        for(int i=0;i<s.length();i++){
            if(sb.isEmpty()){
                sb.push(s.charAt(i));
                st.push(1);
            }
            else{
                if((char)sb.peek() == s.charAt(i)){
                    st.push(st.pop()+1);
                    
                    if(st.peek() == k){
                       sb.pop();
                       st.pop();
                    }
                    
                }
                else{
                    sb.push(s.charAt(i));
                    st.push(1);
                }
            }
            //System.out.println(st);
            //System.out.println(sb);
            
        }
        StringBuilder r = new StringBuilder();
        while(!sb.isEmpty()){
            int p = st.pop();
            char c = sb.pop();
            while(p>0){
                p--;
                r.append(c);
            }
        }
        r.reverse();
        return r.toString();
    }
}
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
