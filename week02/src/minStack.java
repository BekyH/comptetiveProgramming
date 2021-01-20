import java.util.Stack;

public class minStack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public minStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {

        if(st1.empty()){
            st1.push(x);
            st2.push(x);
            return;
        }
        st1.push(x);
        int min = st2.peek();
        if(min<=x){
            st2.push(min);

        }
        else{
            st2.push(x);
        }

    }

    public void pop() {
        st1.pop();
        st2.pop();

    }

    public int top() {
        return st1.peek();
    }

    public int getMin() {
       return st2.peek();

    }
    }

