class MyStack {
    Deque<Integer> deq1;
    Deque<Integer> deq2;
    public MyStack() {
      deq1 = new ArrayDeque<>();
      deq2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        deq1.add(x);
    }
    
    public int pop() {
        while(deq1.size()>1){
            deq2.add(deq1.poll());
        }
        int x = deq1.poll();
        while(!deq2.isEmpty()){
            deq1.add(deq2.poll());
        }
        
        return x;
    }
    
    public int top() {
         while(deq1.size()>1){
            deq2.add(deq1.poll());
        }
        int x = deq1.poll();
        while(!deq2.isEmpty()){
            deq1.add(deq2.poll());
        }
        deq1.add(x);
        
        return x;
    }
    
    public boolean empty() {
       return deq1.isEmpty(); 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */