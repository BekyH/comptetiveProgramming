class Solution {
    public int coinChange(int[] coins, int amount) {
        Deque<Node> deque = new ArrayDeque<>();
        Node node = new Node(amount,0);
        deque.add(node);
        Set<Integer> set = new HashSet<>();
        set.add(amount);
        
        while(!deque.isEmpty()){
             Node nod = deque.poll();
            int curr_amount = nod.amount;
            int step = nod.steps;
            if(curr_amount==0){
                return step;
            }
            for(int i :coins){
                int new_amount = curr_amount-i;
                if(new_amount<0 || set.contains(new_amount)){
                    continue;
                }
                else{
                    //System.out.println(new_amount);
                    Node child = new Node(new_amount,step+1);
                    deque.add(child);
                    set.add(new_amount);
                }
            }
        }
        return -1;
    }
}

class Node{
    int amount;
    int steps;
    
    Node(int amount,int steps){
        this.amount = amount;
        this.steps = steps;
    }
}