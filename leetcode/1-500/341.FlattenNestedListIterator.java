/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    private List<NestedInteger> ni = null;
    private List<Integer> flat = null;
    private Integer idx = 0;
    private ArrayDeque<Integer> q = null;
    
    public NestedIterator(List<NestedInteger> nestedList) {
        this.ni   = nestedList;
        this.flat = new ArrayList<>();
        this.idx  = 0;
        this. q   = new ArrayDeque<Integer>();
    }

    @Override
    public Integer next() {            
        return q.pollFirst();
    }

    @Override
    public boolean hasNext() {
        
        if(q.isEmpty()){
            while(q.isEmpty() && idx < ni.size()){
                NestedInteger n = ni.get(idx++);
                addToQ(n);                
            }
        }
        
        return !q.isEmpty();
    }
    
    private void addToQ(NestedInteger n){
        if(!n.isInteger()){
            for(NestedInteger i : n.getList()){
                addToQ(i);
            }
        }
        else{
            q.offerLast(n.getInteger());
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
//https://leetcode.com/problems/flatten-nested-list-iterator/
