class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] uB = new int[26];
        for(String b : B){
            int[] t = new int[26];
            for(char c : b.toCharArray()){
                t[c-'a']++;
            }
            for(char c : b.toCharArray()){
                int i = c -'a';
                uB[i] = Math.max(uB[i],t[i]);
            }
        }
        List<String> result = new ArrayList<>();
        for(String a : A){
            //System.out.println(a);
            int[] t = new int[26];
            for(char c : a.toCharArray()){
                t[c-'a']++;
            }
            boolean universal = true;
            for(int i = 0; i<26; i++){
                //System.out.println(t[i] + " " + uB[i]);
                if(t[i]<uB[i]){
                    universal = false;
                    break;
                }
            }
            if(universal){
                result.add(a);
            }
        }
        return result;
    }
}
//https://leetcode.com/problems/word-subsets/
