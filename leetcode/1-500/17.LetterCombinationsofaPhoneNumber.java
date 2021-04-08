class Solution {
    public List<String> letterCombinations(String digits) {
        String[] keys = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> lc = new ArrayList<>();
        if(digits.length()>0){
            for(char c : keys[digits.charAt(0)-'0'].toCharArray()){
                lc.add(String.valueOf(c));
            }
            for(int i=1;i<digits.length();i++){
                List<String> a = new ArrayList<>();
                for(char c : keys[digits.charAt(i)-'0'].toCharArray()){
                    for(String k : lc){
                        a.add(k+c);
                    }
                }
                lc.clear();
                lc.addAll(a);
            }
        }
        return lc;
    }
}
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
