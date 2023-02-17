class Solution {
    public List<String> generateParenthesis(int n) {
        Stack<String> st = new Stack<>();
        List<String> result = new ArrayList<>();
        
        generate(n,st,result,0,0);
        
        return result;
        
    }
    
    public void generate(int n, Stack<String> st,List<String> result, int opening, int closing){
        if(opening==closing && opening==n){
            StringBuilder sb = new StringBuilder();
            for(String str:st){
                sb.append(str);
            }
            String s = sb.toString();
            if(isValid(s)){
               result.add(s); 
            }
            
            return;
        }
        
        if(opening<n){
            st.push("(");
            generate(n,st,result,opening+1,closing);
            st.pop();
        }
        if(closing<n){
            st.push(")");
            generate(n,st,result,opening,closing+1);
            st.pop();
        }
    }
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(ch=='(' || ch=='{' || ch=='['){
               stack.push(ch);
           }
           else{
               if(stack.isEmpty()){
                   return false;
               }
               else if((ch==')' && stack.peek()=='(') || (ch=='}' && stack.peek()=='{') || (ch==']' && stack.peek()=='[')){
                  stack.pop(); 
               } 
               else{
                   return false;
               }
           }
       }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}