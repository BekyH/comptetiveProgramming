package com.company;

import java.util.Stack;

public class validateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int poppedPointer=0;
        for(int i:pushed){
            stack.push(i);
            while(!stack.isEmpty() && popped[poppedPointer]==stack.peek()){
                stack.pop();
                poppedPointer++;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
