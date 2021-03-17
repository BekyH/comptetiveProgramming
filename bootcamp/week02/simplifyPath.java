package com.company;

import java.util.Stack;

public class simplifyPath {
    public String simplifyPath(String path) {
        String [] patharr = path.split("/");
        String result="";
        Stack<String> stack = new Stack();
        for(String word:patharr){
            if(word.equals(".") || word.equals("")){
                continue;
            }
            else if(word.equals("..")){
                if(!stack.empty()){
                    stack.pop();
                }

            }
            else{
                stack.add(word);
            }
        }

        for(String word:stack){
            result = result.concat("/");
            result = result.concat(word);
        }
        if(stack.empty()){
            result = result.concat("/");
        }

        return result;

    }
}
