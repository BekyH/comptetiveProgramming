import java.util.Stack;

public class myqueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    /** Initialize your data structure here. */
    public myqueue() {
        st1 = new Stack<>();
        this.st2= new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        this.st1.push(x);


    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!st1.empty()) {
            st2.push(st1.pop());

        }
        int z = st2.pop();

//         for (int y : this.st2) {
//             this.st1.push(y);

//         }

        while (!this.st2.empty()) {
            this.st1.push(this.st2.pop());

        }
        return z;
    }

    /** Get the front element. */
    public int peek() {
        while (!st1.empty()) {
            st2.push(st1.pop());

        }
        int z = st2.peek();


        while (!this.st2.empty()) {
            this.st1.push(this.st2.pop());

        }
        return z;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
            if(this.st1.empty()){
                return true;

    }
    else{
        return false;
            }
}
}
