class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                char c = stack.peek();
                if(Character.isUpperCase(ch) && c==Character.toLowerCase(ch)){
                    stack.pop();
                }
                else if(Character.isLowerCase(ch) && c==Character.toUpperCase(ch)){
                     stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}