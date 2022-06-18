class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> hashmap = new HashMap<>();
        PriorityQueue<Node> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<messages.length;i++){
            String msg = messages[i];
            String sender = senders[i];
            int len = msg.split(" ").length;
            if(hashmap.containsKey(sender)){
                int val = hashmap.get(sender);
                val = val + len;
                hashmap.put(sender,val);
            }
            else{
                hashmap.put(sender,len);
            }
        }
        int max = Collections.max(hashmap.values());
        for(Map.Entry<String,Integer> e: hashmap.entrySet()){
            String str = e.getKey();
            int freq = e.getValue();
            if(freq==max){
                  Node node = new Node(freq, str);
                heap.add(node);
            }
          
        }
        
        return heap.peek().name;
    }
}

class Node implements Comparable<Node>{
    int count;
    String name;
    
    Node(int count,String name){
        this.count = count;
        this.name = name;
        
    }
    @Override
    public int compareTo(Node node){
        if(count==node.count){
            return name.compareTo(node.name);
        }
        
        return count-node.count;
        
    }
}