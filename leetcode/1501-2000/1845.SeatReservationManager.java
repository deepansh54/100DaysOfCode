class SeatManager {
    private PriorityQueue<Integer> q = null;
    public SeatManager(int n) {
        this.q = new PriorityQueue<Integer>();
        for(int i=1;i<=n;i++){
            q.offer(i);
        }
    }
    
    public int reserve() {
        return q.poll();
    }
    
    public void unreserve(int seatNumber) {
        q.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
//https://leetcode.com/problems/seat-reservation-manager/
