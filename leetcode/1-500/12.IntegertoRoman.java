class Solution {
    public String intToRoman(int num) {
        StringBuilder r = new StringBuilder("");
        
        if(num/1000 > 0){
            int p = num/1000;
            r.append("M".repeat(p));
            num = num%1000;
        }
        if(num/100 > 0){
            int p = num/100;
            if(p==9){
                r.append("CM");
            }
            else if(p>=5){
                r.append("D");
                r.append("C".repeat(p-5));              
            }
            else if(p == 4){
                r.append("CD");
            }
            else{
                r.append("C".repeat(p));              
            }
            num%=100;  
        }
        if(num/10 > 0){
            int p = num/10;
            if(p==9){
                r.append("XC");
            }
            else if(p>=5){
                r.append("L");
                r.append("X".repeat(p-5));              
            }
            else if(p == 4){
                r.append("XL");
            }
            else{
                r.append("X".repeat(p));              
            }
            num%=10;  
        }
        
        int p = num;
        if(p==9){
            r.append("IX");
        }
        else if(p>=5){
            r.append("V");
            r.append("I".repeat(p-5));              
        }
        else if(p == 4){
            r.append("IV");
        }
        else{
            r.append("I".repeat(p));              
        }
        
        return r.toString();
    }
}
//https://leetcode.com/problems/integer-to-roman/
