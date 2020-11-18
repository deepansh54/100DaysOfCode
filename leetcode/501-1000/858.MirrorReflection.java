class Solution {
    public int mirrorReflection(int p, int q) {
        if(q==0){
            return 0;
        }
        int a = p%q;
        int b = p%(2*q);
        System.out.println("a="+a+ " b="+b);
        
        if(a == 0 && b == 0){
            int c = p/q;
            int d = p/(2*q);
            if(c<d){
                return 1;
            }
            else{
                return 2;
            }
        }
        else if(a == 0){
            return 1;
        }
        else{
            int c=p;
            while(c%q!=0){
                c+=p;
            }
            int d = p;
            while(d%(2*q)!=0){
                d+=p;
            }
            System.out.println("c="+c+ " d="+d);
            if(c<d){
                if((c/p)%2 == 0){
                    return 0;
                }
                return 1;
            }
            else{
                return 2;
            }
        }
    }
}
//https://leetcode.com/problems/mirror-reflection/