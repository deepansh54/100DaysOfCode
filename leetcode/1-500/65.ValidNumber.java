class Solution {
    public boolean isNumber(String s) {
        
        String regex = "[+-]?([0-9]+)([eE]([+-]?([0-9]+)))?";
        
        String regex2 = "[+-]?([0-9]+)\\.([0-9]+)?([eE]([+-]?([0-9]+)))?";
 
        String regex3 = "[+-]?(\\.[0-9]+)([eE]([+-]?([0-9]+)))?";


        return java.util.regex.Pattern.compile(regex).matcher(s).matches() || 
            java.util.regex.Pattern.compile(regex2).matcher(s).matches() || 
            java.util.regex.Pattern.compile(regex3).matcher(s).matches();
    }
}
//https://leetcode.com/problems/valid-number/
