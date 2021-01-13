class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] m = new int[30001];
        for(int p: people){
            m[p]++;
        }
        int boats = 0;
        for(int p : people){
            if(m[p]<=0){
                continue;
            }
            if(p>=limit){
                boats+=m[p];
                m[p] = 0;
            }
            else{
                int i = m[limit-p];
                if(i>0){
                    if(i>=m[p]){
                        boats+=m[p];
                        m[limit-p] = i-m[p];
                        m[p] = 0;
                    }
                    else{
                        boats+=i;
                        m[p] = m[p] - i;
                        m[limit-p] = 0;
                    }
                }
                else{
                    boats+=m[p];
                    m[p] = 0;
                }
            }
        }
        return boats;
    }
}
//https://leetcode.com/problems/boats-to-save-people/