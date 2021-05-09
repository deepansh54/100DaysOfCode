class Solution {
    public int maxNumberOfBalloons(String text) {
        String s = "balloon";
        int[] a = new int[26];
        for(int i=0;i<text.length();i++){
            a[text.charAt(i)-'a']++;
        }
        int min = 100000;
        for(int i=0;i<s.length();i++){
            int c = a[s.charAt(i)-'a'];
            if(s.charAt(i)=='l' || s.charAt(i) == 'o'){
                c/=2;
            }
            if(c <=min){
                min = c;
            }
        }
        return min;
    }
}
//https://leetcode.com/problems/maximum-number-of-balloons/
