class MinStack {
   Stack<Integer> stack1;
    Stack<Integer> stack2;
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int val) {
        stack1.push(val);
        if(stack2.isEmpty()){
            stack2.push(val);
            return;
        }
        if(val<stack2.peek()){
            stack2.push(val);
            return;
        }
        stack2.push(stack2.peek());
    }
    
    public void pop() {
        stack1.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */