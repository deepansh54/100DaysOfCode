class Solution {
    public int minimumLength(String s) {
        int start = 0;
        int end = s.length()-1;
        boolean reduce = true;
        char a = s.charAt(start);
        while(s.charAt(start) == s.charAt(end) && start<end){
            a = s.charAt(start);
            while(s.charAt(start) == a && s.charAt(end) == a && start<end){
                start++;
                end--;
            }
            while(s.charAt(start) == a && start<=end){
                start++;
            }
            while(s.charAt(end) == a && start<=end){
                end--;
            }
        }
        //System.out.println("start " + start+" end "+ end);
        return end+1-start;
    }
}
//https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
