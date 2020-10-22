class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int j=0; j<asteroids.length;j++){
            if(s.empty() || asteroids[j]>0){
                s.push(asteroids[j]);
                continue;
            }
            if(s.peek()>0){
                if(Math.abs(asteroids[j])>s.peek()){
                    s.pop();
                    j--;
                }
                else if(Math.abs(asteroids[j]) == s.peek()){
                    s.pop();
                }
            }
            else{
                s.push(asteroids[j]);
            }
        }
        int[] a = new int[s.size()];
        int i=s.size()-1;
        while(!s.empty()){
            a[i]=s.pop();
            i--;
        }
        return a;
    }
}
//https://leetcode.com/problems/asteroid-collision/