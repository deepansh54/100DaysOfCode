class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] r = new int[rooms.size()];
        ArrayDeque<Integer> a = new ArrayDeque<>();
        a.offerLast(0);
        while(!a.isEmpty()){
            int c = a.pollFirst();
            if(r[c] != 1){
                List<Integer> p = rooms.get(c);
                for(Integer k : p){
                    a.offerLast(k);
                }
                r[c] = 1;
                //System.out.println("r[c]="+r[c]);
            }
        }
        for(int i=0;i<rooms.size();i++){
            if(r[i] == 0) return false;
        }
        return true;
    }
}
//https://leetcode.com/problems/keys-and-rooms/
