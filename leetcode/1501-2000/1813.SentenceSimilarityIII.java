class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        int i= 0; int j=0;
        String[] s1 = null ; String[] s2 = null;
        if(sentence1.length()>=sentence2.length()){
            s1=sentence1.split(" ");
            s2=sentence2.split(" ");
        }
        else{
            s1=sentence2.split(" ");
            s2=sentence1.split(" ");
        }
        boolean matchFromEnd = true;
        
        int equal = 0;
        int unequal = 0;
        
        for(; i< s1.length && j<s2.length;){
            
            if(s1[i].equals(s2[j])){
                i++;j++;
            }
            else{
                matchFromEnd = true;
                break;
            }
            
        }
//        System.out.println("eq="+equal+" unequal="+unequal+" j="+j+" s2="+s2.length);
        //System.out.println("i="+i+" j="+j);
        if(matchFromEnd){
            for(int x=s1.length-1,y=s2.length-1; x>=i && y>=j; x--, y--){
                if(!s1[x].equals(s2[y])){
                    return false;
                }
            }
        }
        
        return true;
    }
}
//https://leetcode.com/problems/sentence-similarity-iii/
