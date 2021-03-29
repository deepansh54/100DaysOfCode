class Solution {
    public String originalDigits(String s) {
        int[] a = new int[26];
        for(char c : s.toCharArray()){
            a[c-'a']++;
        }
        int[] num = new int[10];
        if(a['z'-'a']>0){
            num[0]=a['z'-'a'];
            a['z'-'a']=0;
            a['e'-'a']-=num[0];
            a['r'-'a']-=num[0];
            a['o'-'a']-=num[0];
        }
        if(a['g'-'a']>0){
            num[8]=a['g'-'a'];
            a['e'-'a']-=num[8];
            a['i'-'a']-=num[8];            
            a['g'-'a']=0;
            a['h'-'a']-=num[8];
            a['t'-'a']-=num[8];
        }
        
        if(a['w'-'a']>0){
            num[2]=a['w'-'a'];
            a['t'-'a']-=num[2];            
            a['w'-'a'] = 0;
            a['o'-'a']-=num[2];
        }
        
        if(a['x'-'a']>0){
            num[6]=a['x'-'a'];
            a['s'-'a']-=num[6];
            a['i'-'a']-=num[6];          
            a['x'-'a'] = 0;
        }
        
        if(a['u'-'a']>0){
            num[4]=a['u'-'a'];
            a['f'-'a']-=num[4];   
            a['o'-'a']-=num[4];            
            a['u'-'a'] = 0;
            a['r'-'a']-=num[4];
        }
        
        if(a['f'-'a']>0){
            num[5]=a['f'-'a'];
            a['f'-'a'] = 0;   
            a['i'-'a']-=num[5];            
            a['v'-'a']-=num[5];
            a['e'-'a']-=num[5];
        }
        
        if(a['r'-'a']>0){
            num[3]=a['r'-'a'];
            a['t'-'a']-=num[3];   
            a['h'-'a']-=num[3];            
            a['r'-'a'] = 0;
            a['e'-'a']-=num[3];
            a['e'-'a']-=num[3];
        }
        
        if(a['v'-'a']>0){
            num[7]=a['v'-'a'];
            a['s'-'a']-=num[7];   
            a['e'-'a']-=num[7];            
            a['v'-'a'] = 0;
            a['e'-'a']-=num[7];
            a['n'-'a']-=num[7];
        }
        
        if(a['o'-'a']>0){
            num[1]=a['o'-'a'];
            a['o'-'a'] = 0;            
            a['n'-'a']-=num[1];
            a['e'-'a']-=num[1];
        }
        
        if(a['i'-'a']>0){
            num[9]=a['i'-'a'];
            a['n'-'a']-=num[9];
            a['i'-'a'] = 0;               
            a['n'-'a']-=num[9];
            a['e'-'a']-=num[9];
        }
        StringBuilder res = new StringBuilder("");
        for(int i=0;i<10;i++){
            if(num[i]>0){
                res.append(String.valueOf(i).repeat(num[i]));
            }
        }
        return res.toString();
    }
}
//https://leetcode.com/problems/reconstruct-original-digits-from-english/
