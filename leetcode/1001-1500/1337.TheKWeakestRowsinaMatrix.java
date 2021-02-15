class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Integer[]> s = new PriorityQueue(k, (p,q) -> {
            if(((Integer[])p)[0] > ((Integer[])q)[0]){
                return 1;
            }
            else if(((Integer[])p)[0] == ((Integer[])q)[0]){
                if(((Integer[])p)[1]>((Integer[])q)[1]){
                    return 1;
                }
            }
            return -1;
        });
        for(int i=0; i<mat.length; i++){
            int c =0;
            for(int j=0;j<mat[i].length; j++){
                if(mat[i][j] == 1){
                    c++;
                }
                else{
                    break;
                }
            }
            s.add(new Integer[]{c,i });

        }
        int[] ans = new int[k];
        for(int i=0;i<k && !s.isEmpty();i++){
            ans[i] = s.poll()[1];
        }
        return ans;
    }
}
//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
