class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        PriorityQueue<Node> min_heap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                int val = hashmap.get(nums[i]);
                val = val +1;
                hashmap.put(nums[i],val);
            }
            else{
                hashmap.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hashmap.entrySet()){
            Node node = new Node(e.getKey(), e.getValue());
            if(min_heap.size()<k){
                min_heap.add(node);
            }
            else{
                if(min_heap.peek().freq<node.freq){
                    min_heap.poll();
                    min_heap.add(node);
                }
            }
            
        }
        int [] res = new int[k];
        int index=0;
        while(index<k){
            res[index++] = min_heap.poll().val;
        }
        return res;
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
        return freq-node.freq;
    }
    
}