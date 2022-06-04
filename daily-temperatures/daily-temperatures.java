class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Node> st = new Stack();
        int n = temperatures.length;
        int [] ans = new int[n];
        for(int i=0;i<temperatures.length;i++){
              Node node = new Node(temperatures[i],i);
            if(st.isEmpty()){
                st.add(node);
            }
            else{
                while(!st.isEmpty() && node.val>st.peek().val){
                    Node nod = st.pop();
                    ans[nod.index] = node.index-nod.index;
                }
                st.push(node);
            }
        }
        
        return ans;
    }
}

class Node{
    int val;
    int index;
    Node(int val,int index){
        this.val = val;
        this.index = index;
    }
}