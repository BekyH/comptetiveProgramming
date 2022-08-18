class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Node> max_heap = new PriorityQueue<>();
        for(int i:arr){
            if(map.containsKey(i)){
                int val = map.get(i);
                val = val + 1;
                map.put(i,val);
            }
            else{
                map.put(i,1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            Node node = new Node(e.getValue(),e.getKey());
            max_heap.add(node);
        }
     
        int n = arr.length;
        int counter=0;
        int half = n/2;
        while(n>half){
            //System.out.println("here");
            Node curr = max_heap.poll();
          //  System.out.println(curr.num);
            n = n-curr.freq;
            counter++;
        }
        
        return counter;
    }   
}

class Node implements Comparable<Node>{
    int freq;
    int num;
    Node(int freq,int num){
        this.freq = freq;
        this.num = num;
    }
    
    @Override
    public int compareTo(Node node){
        
        return node.freq-freq;
    }
}
