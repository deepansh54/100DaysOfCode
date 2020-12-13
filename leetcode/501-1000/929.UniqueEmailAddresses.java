class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        String[] parts = null;
        StringBuilder s = new StringBuilder();
        for(String email : emails){
            parts = email.split("@");
            for(int i=0;i<parts[0].length();i++){
                if(parts[0].charAt(i) == '+'){
                    break;
                }
                else if(parts[0].charAt(i)!='.'){
                    s.append(parts[0].charAt(i));
                }                    
            }
            s.append("@").append(parts[1]);
            set.add(s.toString());
            s=new StringBuilder();
        }
        return set.size();
    }
}
//https://leetcode.com/problems/unique-email-addresses/