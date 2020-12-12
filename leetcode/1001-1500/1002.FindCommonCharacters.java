class Solution {
    public List<String> commonChars(String[] A) {
        // if(A.length==1){
        //     return Arrays.asList(A[0].split(""));
        // }
        int[][] n = new int[A.length][26];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length();j++){
                n[i][A[i].charAt(j)-'a']++;
            }
        }
        List<String> s = new ArrayList<>();
        for(int i=0;i<26;i++){
            boolean found =true;
            int min=99999;
            for(int j=0;j<A.length;j++){
                min = Math.min(min,n[j][i]);
            }
            for(int k=0;k<min;k++){
                s.add(String.valueOf((char)(i+'a')));
            }
        }
        return s;
    }
}
//https://leetcode.com/problems/find-common-characters/