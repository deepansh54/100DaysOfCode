class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] a = new int[26];
        for(int i=0;i<26;i++){
            a[order.charAt(i)-'a']=i;
        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                for(int k = 0; k<words[i].length();k++){
                    if(k>=words[j].length()){
                        return false;
                    }
                    if(a[words[j].charAt(k)-'a'] < a[words[i].charAt(k)-'a']){
                        return false;
                    }
                    if(a[words[j].charAt(k)-'a'] > a[words[i].charAt(k)-'a']){
                        break;
                    }
                }
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/verifying-an-alien-dictionary/
