class Solution {
    public List<String> letterCasePermutation(String S) {
        int lenChars = 0;
        for(char a : S.toCharArray()){
            if(a > '9'){
                lenChars++;
            }
        }
        int n = 1 << lenChars;
        //System.out.println(n);
        List<String> perms = new ArrayList<>();
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            lenChars = 0;
            for(int j=0; j<S.length(); j++){
                if(S.charAt(j) > '9'){
                    //System.out.println(S.charAt(j));

                    if((i & (1<<lenChars)) > 0){
                        if(S.charAt(j) >= 'a'){
                            sb.append((char)(S.charAt(j) - 32));
                        }
                        else{
                            sb.append((char)(S.charAt(j) + 32));
                        }
                        
                    }
                    else{
                        sb.append(S.charAt(j));
                    }
                    lenChars++;
                }
                else{
                    sb.append(S.charAt(j));
                }
            }
            perms.add(sb.toString());
        }
        return perms;
    }
}
//https://leetcode.com/problems/letter-case-permutation/
