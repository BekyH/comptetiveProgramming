class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Node> max_heap = new PriorityQueue<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int [] result = new int[k];
        for(int num:nums){
            
            if(map.containsKey(num)){
                int val = map.get(num);
                val = val + 1;
                map.put(num,val);
            }
            else{
                map.put(num,1);
            }
            
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            Node node = new Node(e.getKey(),e.getValue());
            max_heap.add(node);
        }
        int index = 0;
        while(k>0){
            result[index++] = max_heap.poll().val;
            k--;
        }
        
      
        return result;
    }
}

class Node implements Comparable<Node>{
    int val;
    int freq;
    Node(int val,int freq){
        this.val = val;
        this.freq = freq;
    }
    
    @Override
    public int compareTo(Node node){
        return node.freq - freq;
    }
}