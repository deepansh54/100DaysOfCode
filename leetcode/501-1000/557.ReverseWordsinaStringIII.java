class Solution {
    public String reverseWords(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = s.indexOf(' ', 0);
        while(end != -1){
            reverse(c,start,end-1);
            start = end+1;
            end = s.indexOf(' ', start);
        }
        reverse(c,start,s.length()-1);
        return String.valueOf(c);
    }
    private void reverse(char[] arr, int i, int j){
        char c = ' ';
        while(i<=j){
            c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
            i++;
            j--;
        }
    }
}
//https://leetcode.com/problems/reverse-words-in-a-string-iii/
