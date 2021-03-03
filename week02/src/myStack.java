import java.util.LinkedList;

class MyStack {

    LinkedList<Integer> queue1;
    LinkedList<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();


    }

    /** Push element x onto stack. */
    public void push(int x) {
        while(queue1.size()!=0){
            int temp = queue1.remove();
            queue2.add(temp);
        }
        queue1.add(x);
        while(queue2.size()!=0){
            int temp = queue2.remove();
            queue1.add(temp);
        }


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue1.remove();
    }

    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.isEmpty()){
            return true;
        }
        return false;
    }
}