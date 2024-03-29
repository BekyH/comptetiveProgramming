// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Deque<Integer> arrayDeque;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        arrayDeque = new ArrayDeque<>();
        while(iterator.hasNext()){
            arrayDeque.add(iterator.next());
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
            return arrayDeque.peek();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	   return arrayDeque.poll();
	}
	
	@Override
	public boolean hasNext() {
	    return arrayDeque.isEmpty()? false:true;
	}
}