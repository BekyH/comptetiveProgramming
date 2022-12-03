class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        PriorityQueue<Node> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<s.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                int val = hashmap.get(s.charAt(i));
                val = val+1;
                hashmap.put(s.charAt(i),val);
            }
            else{
                hashmap.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> e:hashmap.entrySet()){
             Node node = new Node(e.getKey(),e.getValue());
            max_heap.add(node);
        }
        StringBuilder sb = new StringBuilder();
        while(!max_heap.isEmpty()){
            Node node = max_heap.poll();
            char ch = node.c;
            int val = node.freq;
            for(int i=0;i<val;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

class Node implements Comparable<Node>{
    char c;
    int freq;
    Node(char c,int freq){
        this.c = c;
        this.freq = freq;
    }
     @Override
    public int compareTo(Node node){
        return freq-node.freq;
    }
}