class Solution {
    public String findLongestWord(String s, List<String> d) {
        String longest = "";
        int lenS = s.length();
        int lenK = 0;
        int i = 0;
        int j = 0;
        if(d!=null){
            for(int x = 0; x<d.size(); x++) {
                String k = d.get(x);
                i=0;
                j=0;
                lenK = k.length();
                while(i<lenS && j<lenK){
                    if(k.charAt(j) == s.charAt(i)){
                        i++;
                        j++;
                    }
                    else{
                        i++;
                    }
                }
                if(j==lenK){
                    if(longest.length() < lenK){
                        longest = k;
                    }
                    else if(longest.length() == lenK){
                        if(longest.compareTo(k) >= 0){
                            longest = k;
                        }
                    }
                }
            }
        }
        return longest;
    }
}
//https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
