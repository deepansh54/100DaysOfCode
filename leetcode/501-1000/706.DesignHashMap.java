class MyHashMap {
    
    class Entry{
        public int key;
        public int value;
        public Entry next;
        public Entry(int key, int value){ this.key=key; this.value=value;}
    }
    
    Entry[] e;
    /** Initialize your data structure here. */
    public MyHashMap() {
        e = new Entry[11214];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int k = key%11213;
        if(e[k]!=null){
            Entry t = e[k];
            while(t.key != key && t.next != null){
                t = t.next;
            }
            if(t.key == key){
                t.value = value;
            }
            else{
                t.next = new Entry(key,value);
            }
        }
        else{
            e[k] = new Entry(key,value);
        }
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int k = key%11213;
        if(e[k]!=null){
            Entry t = e[k];
            while(t.key != key && t.next!=null){
                t = t.next;
            }
            if(t.key == key){
                return t.value;
            }
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int k = key%11213;
        if(e[k]!=null){
            Entry t = e[k];
            Entry p = null;
            while(t.key != key){
                p=t;
                if(t.next == null) break;
                t = t.next;
            }
            if(t.key == key){
                if(p!=null){
                    p.next = t.next;
                }
                else{
                    e[k] = t.next;
                }
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
//https://leetcode.com/problems/design-hashmap/
