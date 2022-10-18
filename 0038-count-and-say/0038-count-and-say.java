class Solution {
    public String countAndSay(int n) {
        
        String str = "1";
        String [] memo = new String[n+1];
        memo[0] = str;
        for(int i=1;i<n+1;i++){
            StringBuilder sb = new StringBuilder();
            Stack<Node> stack = new Stack<Node>();
            String st = memo[i-1];
            for(int j=0;j<st.length();j++){
                if(stack.isEmpty()){
                    Node no = new Node(st.charAt(j),1);
                    stack.push(no);
                }
                else if(stack.peek().val==st.charAt(j)){
                        stack.peek().count++;
                }
                else{
                    Node no = new Node(st.charAt(j),1);
                    stack.push(no);
                }
            }
            for(Node nodd:stack){
                //System.out.println(nodd.count);
                sb.append(nodd.count);
                sb.append(nodd.val);
            }
            // while(!stack.isEmpty()){
            //     stack.pop();
            // }
            memo[i] = sb.toString();
            
        }
        
        return memo[n-1];
    }
}
class Node{
    char val;
    int count;
    Node(char val,int count){
        this.val = val;
        this.count = count;
    }
}