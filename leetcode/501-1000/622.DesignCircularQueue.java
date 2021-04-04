class MyCircularQueue {
    
    private int[] q = new int[1];
    int front = 0;
    int rear  = 0 ;
    int size  = 0;

    public MyCircularQueue(int k) {
        q = new int[k];
        front = -1;
        rear  = -1;
        size  = k;
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            if(front==-1){
                front = 0;
            }
            rear = (rear+1)%size;
            q[rear] = value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        if(front != rear){
            front = (front+1)%size;
        }
        else{
            front = -1;
            rear  = -1;
        }
        return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return q[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return !isEmpty() && (rear==front-1 || (front ==0 && rear == size-1));
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
//https://leetcode.com/problems/design-circular-queue/
