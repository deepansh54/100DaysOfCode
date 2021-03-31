class Solution {
    public String reformatNumber(String number) {
        StringBuilder s = new StringBuilder("");
        for(char c : number.toCharArray()){
            if(c >= '0' && c <='9'){
                s.append(c);
            }
        }

        StringBuilder r = new StringBuilder("");

        //String str = s.toString();
        int len = s.length();
        int z=0;
        while(len>0){
            if(len>4){
                r.append(s.substring(z,z+3));
                z+=3;
                len-=3;
                r.append("-");
            }
            else{
                if(len == 4 ){
                    r.append(s.substring(z,z+2));
                    r.append("-");
                    r.append(s.substring(z+2));
                }
                else{
                    r.append(s.substring(z));
                }
                break;
            }
        }
        return r.toString();
    }
}
//https://leetcode.com/problems/reformat-phone-number/
