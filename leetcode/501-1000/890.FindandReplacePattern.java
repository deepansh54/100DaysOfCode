class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> results = new ArrayList<>();
        for(String word : words){
            int[] a = new int[27];
            int[] b = new int[27];
            boolean match = true;
            for(int i=0;i<pattern.length();i++){
                if(a[pattern.charAt(i)-'a']>0 || b[word.charAt(i)-'a']>0){
                    if(a[pattern.charAt(i)-'a'] != (word.charAt(i)-'a'+1) || b[word.charAt(i)-'a'] != (pattern.charAt(i)-'a'+1)){
                        match = false;
                        break;
                    }
                }
                else{
                    a[pattern.charAt(i)-'a'] = (word.charAt(i)-'a'+1);
                    b[word.charAt(i)-'a'] = (pattern.charAt(i)-'a'+1);
                }
            }
            if(match){
                results.add(word);
            }
        }
        return results;
    }
}
//https://leetcode.com/problems/find-and-replace-pattern/
