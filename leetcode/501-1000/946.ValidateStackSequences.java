class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int[] visited  = new int[1001];
        Stack<Integer> s = new Stack<>();
        
        for(int i=0, j=0; i<popped.length ; i++){
            //System.out.println("Pop i "+popped[i]+" visited = "+visited[popped[i]]);
            if(visited[popped[i]] == -1){
                return false;
            }
            else if(visited[popped[i]] == 1){
                int pop = -1;
                while(pop != popped[i]){
                    
                    pop = s.pop(); 
                    visited[pop] = -1;
                    //System.out.println("Pop "+pop);
                } 
            }
            else if(j< pushed.length){
                while(pushed[j] != popped[i]){
                    s.push(pushed[j]);
                    visited[pushed[j]] = 1;
                    //System.out.println("Push "+pushed[j]);
                    j++;
                }
                visited[pushed[j]] = -1;
                j++;
            }
            else{
                return false;
            }
            //System.out.println("Final Pop i "+popped[i]+" visited = "+visited[popped[i]]);

        }
        return true;
    }
}
//https://leetcode.com/problems/validate-stack-sequences/
