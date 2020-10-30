class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> d = new ArrayDeque<>();
        int tmp = 0;
        for(int i=deck.length-1;i>=0;i--){
            d.offerFirst(deck[i]);
            if(i>0){
                tmp = d.pollLast();
                d.offerFirst(tmp); 
            }
        }
        return d.stream().mapToInt(Integer::intValue).toArray();
    }
}
//https://leetcode.com/problems/reveal-cards-in-increasing-order/