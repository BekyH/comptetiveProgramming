class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<tokens.length;i++){
            String str = tokens[i];
            int z = 0;
            
            if(str.equals("+")){
                 int y = stack.pop();
                 int x = stack.pop();
                    z = x + y;
                    stack.push(z);
                }
                else if(str.equals("-")){
                     int y = stack.pop();
                     int x = stack.pop();
                    z = x-y;
                    stack.push(z);
                    
                }
                else if(str.equals("*")){
                     int y = stack.pop();
                      int x = stack.pop();
                    z = x * y;
                    stack.push(z);
                    
                }
                else if(str.equals("/")){
                     int y = stack.pop();
                      int x = stack.pop();
                   // System.out.println(stack);
                    z = x/y;
                    stack.push(z);
                    
                }
                else{
                    stack.push(Integer.parseInt(str));
                }
                
            }
                
        
        
        return stack.peek();
    }
}