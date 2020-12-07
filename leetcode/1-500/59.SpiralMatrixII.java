class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int k = 1;
        int i=0;
        int j=0;
        boolean right = true;
        boolean down = false;
        boolean left = false;
        boolean top = false;
        
        while(k<=n*n){
            a[i][j]=k;
            //System.out.println("i="+i+" j="+j+" k="+k);
            //System.out.println(String.format("r = %s, d = %s, l = %s, t = %s",right,down,left,top));
            k++;
            if(right){
                if(j+1<n && a[i][j+1] == 0){
                    j++;
                }
                else{
                    right=false;
                    down = true;
                }
            }
            if(down){
                if(i+1<n && a[i+1][j] == 0){
                    i++;
                }
                else{
                    down = false;
                    left = true;
                }
            }
            if(left){
                if(j-1>=0 && a[i][j-1] == 0){
                    j--;
                }
                else{
                    left = false;
                    top = true;
                }
            }
            if(top){
                if(i-1>=0 && a[i-1][j]==0 ){
                    i--;
                }
                else{
                    top = false;
                    right = true;
                    j++;
                }
            }
        }
        
        return a;
    }
}
//https://leetcode.com/problems/spiral-matrix-ii/