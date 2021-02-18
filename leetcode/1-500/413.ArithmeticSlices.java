class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int slices = 0;
        if(A.length>=3){
            int d = A[1] - A[0];
            int n = 2;
            for(int i=1;i<A.length-1;i++){
                if(A[i+1]-A[i] != d){
                    if(n==3){
                        slices+=1;
                    }
                    else if(n>3){
                        int k = 3;
                        while(k<=n){
                            slices+=(n-k+1);
                            k++;
                        }
                    }
                    n=2;
                    d = A[i+1]-A[i];
                }
                else{
                    n++;
                }
            }
            if(n==3){
                slices+=1;
            }
            else if(n>3){
                int k = 3;
                while(k<=n){
                    slices+=(n-k+1);
                    k++;
                }
            }
        }
        return slices;
    }
}
//https://leetcode.com/problems/arithmetic-slices/
