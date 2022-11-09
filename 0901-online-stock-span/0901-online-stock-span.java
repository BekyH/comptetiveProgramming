class StockSpanner {
Stack<Node> stack;
    public StockSpanner() {
        stack = new Stack<>();
        
    }
    
    public int next(int price) {
         int res =1;
        while(!stack.isEmpty() && stack.peek().val<=price){
             res = res + stack.pop().result;
        }
        stack.push(new Node(price,res));
        return res;
    }
}

class Node{
    int val;
    int result;
    Node(int val,int result){
        this.val = val;
        this.result = result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */