class Solution {
    public int beautySum(String s) {
        int beauty = 0;
        
        for(int i=2;i<s.length();i++){
            
            int[] t = new int[26];
            for(int j=0; j<s.length();j++){
                int c = s.charAt(j)-'a';
                if(j<i){
                    t[c]++;
                }
                else if (j==i){
                    t[c]++;
                    beauty+=getBeauty(t);
                }
                else{
                    t[c]++;
                    int d = s.charAt(j-i-1)-'a';
                    t[d]--;
                    beauty+=getBeauty(t);
                }
                                
                //System.out.println("i="+i+" j="+j+" arr="+Arrays.toString(t));

            }
        }
        //System.out.println("################# " + beauty + " ##################");

        return beauty;
    }
    public int getBeauty(int[] t){
        int max1 = 0;
        int min1 = 1000;
        for(int k=0;k<26;k++){
            if(t[k] == 0) continue;
            if(t[k] > max1){
                max1 = t[k];
            }
            if(t[k] < min1){
                min1 = t[k];
            }
        }
        return (max1-min1);
    }
}
//https://leetcode.com/problems/sum-of-beauty-of-all-substrings/
