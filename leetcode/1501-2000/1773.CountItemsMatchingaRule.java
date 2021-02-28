class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String,String> m = new HashMap<>();

        if(ruleKey.equals("type")){
            return (int) items.stream().filter(i -> i.get(0).equals(ruleValue)).count();
        }
        else if(ruleKey.equals("color")){
            return (int) items.stream().filter(i -> i.get(1).equals(ruleValue)).count();
        }
        else{
            return (int) items.stream().filter(i -> i.get(2).equals(ruleValue)).count();
        }
    }
}
//https://leetcode.com/problems/count-items-matching-a-rule/
