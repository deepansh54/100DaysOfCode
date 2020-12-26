class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count =0;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int st0 = 0;
        int st1 = 0;
        for(int i=0;i<students.length;i++){
            if(students[i]==0){
                st0++;
            }
            else{
                st1++;
            }
        }
        int i=0;
        int j=0;
        for(;i<students.length;i++){
            
            if(sandwiches[j] == students[i]){
                j++;
                if(students[i]==0){
                    st0--;
                }
                else{
                    st1--;
                }
            }
            else{
                st.offerLast(students[i]);
            }
        }
        while(!st.isEmpty()){
            int c = st.pollFirst();
            if((sandwiches[j] ==0 && st0<=0) || (sandwiches[j]==1 &&st1<=0)){
                return st.size()+1;
            }
            if(sandwiches[j] == c){
                j++;
                if(c==0){
                    st0--;
                }
                else{
                    st1--;
                }
            }
            else{
                st.offerLast(c);
            }
        }
        return st.size();
    }
}
//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/