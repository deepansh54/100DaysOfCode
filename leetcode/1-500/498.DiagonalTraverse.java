class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int len = 0;
        int m = matrix.length;
        if(m==0){
            return new int[0];
        }
        int n = matrix[0].length;
        int totalLen = m*n;
        int[] result = new int[totalLen];
        boolean even = true;
        for(int i=0, j=0; len<totalLen;){
            int startLen = len;
            // System.out.println("i:" + i + " j:"+j);
            for(int k=j,l=i; k>=0 && l<m; k--,l++){
                result[len] = matrix[l][k];
                len++;
            }
            
            // System.out.println("Current: " + Arrays.toString(result));
            
            if(even){
                // System.out.println("even="+even+" startLen="+startLen+" len="+len);
                for(int a=startLen, b = len-1;a<b;a++,b--){
                    int tmp = result[a];
                    result[a] = result[b];
                    result[b] = tmp;
                }
                even = false;
                // System.out.println(Arrays.toString(result));
            }
            else{
                // System.out.println("even="+even+" startLen="+startLen+" len="+len);
                // System.out.println(Arrays.toString(result));
                even = true;
            }
            if(j<n-1){
                j++;
            }
            else if(j==n-1){
                i++;
            }
        }
        return result;
    }
}
//https://leetcode.com/problems/diagonal-traverse/