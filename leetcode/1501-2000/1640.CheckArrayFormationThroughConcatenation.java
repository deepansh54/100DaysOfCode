class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> piecesMap = new HashMap<>();
        for(int i=0;i<pieces.length;i++){
            piecesMap.put(pieces[i][0], i);
        }
        //System.out.println(piecesMap);
        for(int i=0;i<arr.length;){
            Integer p = piecesMap.get(arr[i]);
            if(p==null){
                return false;
            }
            else{
                for(int j=0;j<pieces[p].length;j++){
                    if(arr[i] == pieces[p][j]){
                        i++;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
//https://leetcode.com/problems/check-array-formation-through-concatenation/