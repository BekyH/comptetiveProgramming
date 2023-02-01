class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        List<Node> list = new ArrayList<>();
        int n = plantTime.length;
        for(int i=0;i<n;i++){
            list.add(new Node(plantTime[i],growTime[i]));
        }
        Collections.sort(list,(a,b)->(a.g-b.g));
        Collections.reverse(list);
        int max_days = Integer.MIN_VALUE;
        int prev = 0;
    
        for(Node node:list){
            prev = prev + node.p;
            max_days = Math.max(max_days,prev+node.g);
            
        }
        
        return max_days;
    }
}

class Node{
    int p;
    int g;
    Node(int p,int g){
        this.p = p;
        this.g = g;
    }
}