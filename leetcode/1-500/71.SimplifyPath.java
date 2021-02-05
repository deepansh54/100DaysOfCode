class Solution {
    public String simplifyPath(String path) {
        Stack<Character> s = new Stack<>();
        int c=0;
        for(char a : path.toCharArray()){
            
            if(a == '/'){
                if(s.isEmpty()){
                    s.push(a);
                }
                else if(s.peek() == '.'){
                    if(c==1){
                        s.pop();
                    }
                    else if(c==2){
                        s.pop();
                        s.pop();
                        if(!s.isEmpty()) s.pop();
                        while(!s.isEmpty() && s.peek()!='/'){
                            s.pop();
                        }
                    }
                    else{
                        s.push(a);
                    }
                    c=0;
                }
                else if(s.peek()!='/'){
                    s.push(a);
                }                
            }
            else if(a == '.'){
                c++;
                s.push(a);
            }
            else{
                c=0;
                s.push(a);
            }
            // System.out.println(c);
            // System.out.println(s);
        }
        
        if(!s.isEmpty() && s.peek() == '.'){
            if(c==1){
                s.pop();
            }
            else if(c==2){
                s.pop();
                s.pop();
                if(!s.isEmpty()) s.pop();
                while(!s.isEmpty() && s.peek()!='/'){
                    s.pop();
                }
            }
        } 
        // System.out.println(s);
        
        StringBuilder p = new StringBuilder();
        while(!s.isEmpty()){
            p.append(s.pop());
        }
        p.reverse();
        if(p.length() == 0 || p.charAt(0)!='/'){
            p.insert(0,'/');
        }
        if(p.length() > 1 && p.charAt(p.length()-1) == '/'){
            p.deleteCharAt(p.length()-1);
        }
        return p.toString();
    }
}
// "/home/"
// "/../"
// "/home//foo/"
// "/a/./b/../../c/"
//"/.././em/jl///../.././../E/"
//"/home/../../.."

//https://leetcode.com/problems/simplify-path/
