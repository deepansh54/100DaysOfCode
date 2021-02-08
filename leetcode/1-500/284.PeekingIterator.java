// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    private final Iterator<Integer> iterator;
    private Integer peekedVal;
    private Integer nextVal;

    
	public PeekingIterator(Iterator<Integer> iterator) {
	    this.iterator = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peekedVal==null){
            peekedVal = iterator.next();
            nextVal = peekedVal;
        }
        return peekedVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(peekedVal!=null){
            peekedVal = null;
            return nextVal;
        }
	    return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
        if(peekedVal!=null){
            return true;
        }
	    return iterator.hasNext();
	}
}
//https://leetcode.com/problems/peeking-iterator/
