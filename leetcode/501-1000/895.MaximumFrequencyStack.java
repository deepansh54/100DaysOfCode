class FreqStack {
    private final PriorityQueue<Item> p;
    private final Map<Integer, Item> m;
    private int c = 0;

    public FreqStack() {
        p = new PriorityQueue<Item>((a,q) -> {
            if(a.frequency < q.frequency){
                return 1;
            }
            else if(a.frequency > q.frequency){
                return -1;
            }
            else{
                return Integer.compare(q.idx.peek(),a.idx.peek());
            }
        });
        m = new HashMap<>();
    }
    
    public void push(int x) {
        Item i = m.get(x);
        if(i == null){
            i = new Item();
            i.frequency = 1;
            i.val = x;
            i.idx.push(c);
            m.put(x,i);
            p.add(i);
        }
        else{
            p.remove(i);
            i.frequency++;
            i.idx.push(c);
            p.add(i);
        }
        c++;
        //System.out.println("[push] - " + p);
    }
    
    public int pop() {
        Item i = p.poll();
        i.idx.pop();
        i.frequency--;
        if(i.frequency!=0){
            p.add(i);
        }
        //System.out.println("[pop] - " + p);
        return i.val;
    }
    
    private static class Item {
        public int frequency;
        public int val;
        public Stack<Integer> idx = new Stack<>();

        @Override
        public String toString(){
            return val+"="+frequency+" idx="+idx.peek();
        }
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
//https://leetcode.com/problems/maximum-frequency-stack/
