class Solution {
    public int calculate(String s) {
        Stack<Character> ops = new Stack<>();
        Stack<Integer> vals = new Stack<>();
        char[] c = s.toCharArray();
        int v =0;
        for(int i=0;i<c.length;i++){
            if(c[i]!=' '){
                if (c[i]>='0'){
                    v = 0;
                    do{
                        v*=10;
                        v+= (c[i]-'0');
                        i++;
                    }while(i<c.length&&c[i]>='0');
                    i--;
                    vals.push(v);
                }
                else {
                    evaluate(ops,vals,c[i]);
                    ops.push(c[i]);
                }
            }
        }
        evaluate(ops,vals,' ');
        return vals.pop();
    }
    public void evaluate(Stack<Character> ops , Stack<Integer> vals, char currentOp){
        while(!ops.isEmpty()){
            Character op = ops.pop();
            if((op == '+' || op == '-') && (currentOp == '*' || currentOp == '/')){ 
                ops.push(op);
                break;
            }
            int val2 = vals.pop();
            int val1 = vals.pop();
            switch(op){
                case '*':
                    vals.push(val1*val2);break;
                case '/':
                    vals.push(val1/val2);break;
                case '+':
                    vals.push(val1+val2);break;
                case '-':
                    vals.push(val1-val2);break;
            }
        }
    }
}
https://leetcode.com/problems/basic-calculator-ii/