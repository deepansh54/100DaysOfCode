class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        
        int[] a1 = new int[26];
        int[] a2 = new int[26];
        int[] a3 = new int[26];
        
        for( char p : s1.toCharArray() ){
            a1[p-'a']++;
        }
        for( char p : s2.toCharArray() ){
            a2[p-'a']++;
        }
        for( char p : s3.toCharArray() ){
            a3[p-'a']++;
        }
        List<String> lp = new ArrayList<>();
        for(String w : words){
            String word = w.toLowerCase();
            boolean found = true;
            for(char p : word.toCharArray()){
                if(a1[p-'a'] == 0){
                    found = false;
                    break;
                }
            }
            if(!found){
                found = true;
                for(char p : word.toCharArray()){
                    if(a2[p-'a'] == 0){
                        found = false;
                        break;
                    }
                }
            }
            if(!found){
                found = true;
                for(char p : word.toCharArray()){
                    if(a3[p-'a'] == 0){
                        found = false;
                        break;
                    }
                }
            }
            if(found){
                lp.add(w);
            }
        }
        return lp.toArray(new String[lp.size()]);
    }
}
//https://leetcode.com/problems/keyboard-row/
