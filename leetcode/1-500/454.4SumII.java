class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int sum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                sum = A[i] + B[j];
                sumMap.put(sum, sumMap.getOrDefault(sum, 0)+1);
            }
        }
        int fourSum = 0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                sum = (C[i] + D[j]) * -1;
                fourSum += sumMap.getOrDefault(sum, 0);
            }
        }
        return fourSum;
    }
}
//https://leetcode.com/problems/4sum-ii/