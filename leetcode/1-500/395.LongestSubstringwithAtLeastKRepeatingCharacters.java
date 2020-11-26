class Solution {
    public int longestSubstring(String s, int k) {
        //System.out.println("String - "+s);
        int[] a = new int[26];
        char[] sc = s.toCharArray();
        for(char c : sc){
            a[c-'a']+=1;
        }
        int start = 0;
        int end = 0;
        int max = -1;
        boolean found = true;
        for(int i=0; i<sc.length; i++){
            if(a[sc[i]-'a']<k){
                found = false;
                if(start!=end){
                    int val = longestSubstring(s.substring(start,end), k);
                    //System.out.println("String Value- "+val);
                    if(val>max){
                        max = val;
                    }
                }                
                end++;
                start=end;
            }
            else {
                end++;
            }
        }
        if(!found){
            int val = longestSubstring(s.substring(start,end), k);
            //System.out.println("String end Value- "+val);
            if(val>max){
                max = val;
            }
        }        
        //System.out.println("String - "+ s +" start- "+start+" end- "+end+" max- "+max);
        return max!=-1?max:(found?sc.length:0);
    }
}
//https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/