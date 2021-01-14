class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> s = new HashSet<>();
        int len = 0;
        for(int i=0; i<candyType.length;i++){
            if(s.add(candyType[i])){
                len++;
                if(len>candyType.length/2){
                    return candyType.length/2;
                }
            }        
        }
        return len;
    }
}
//https://leetcode.com/problems/distribute-candies/
