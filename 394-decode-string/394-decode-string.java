class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            StringBuilder letters = new StringBuilder();
            StringBuilder numbers = new StringBuilder();
            if(s.charAt(i)==']'){
                while(!st.isEmpty() && Character.isLetter(st.peek())){
                    letters.append(st.pop());
                }
                
                letters.reverse();
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    
                    numbers.append(st.pop());
                }
                numbers.reverse();
                String str = letters.toString();
                int r = Integer.parseInt(numbers.toString());
                String strr = str.repeat(r);
                for(int k=0;k<strr.length();k++){
                    st.push(strr.charAt(k));
                }
                
            }
            else{
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            if(Character.isLetter(st.peek())){
                ans.append(st.pop());
            }
               else{
                   st.pop();
               }
            
        }
        
        return ans.reverse().toString();
    }
}