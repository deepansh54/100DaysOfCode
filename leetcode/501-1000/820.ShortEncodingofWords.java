class Solution {
    public int minimumLengthEncoding(String[] words) {
        List<String> ls = new ArrayList<>();
        for(String w : words){
            check(ls,w);
        }
        int len = 0;
        for(String r : ls){
            len+=r.length()+1;
        }
        return len;
    }
    public void check(List<String> r, String w){
        String found = null;
        boolean f = false;
        for(String p : r){
            f = true;
            for(int i=p.length()-1, j=w.length()-1; i>=0 && j>=0 ; i--,j--){
                if(p.charAt(i) != w.charAt(j)){
                    f=false;
                    break;
                }
            }
            if(f){
                found = p;
                break;
            }
        }
        if(f){
            if(found.length()<w.length()){
                r.remove(found);
                r.add(w);
            }
        }
        else{
            r.add(w);
        }
    }
}
//https://leetcode.com/problems/short-encoding-of-words/
