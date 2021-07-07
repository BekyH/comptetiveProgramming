import java.util.*;
public class reducearraysize {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int n = arr.length;
        int m = n/2;
        for(int i=0;i<arr.length;i++){
            if(hashmap.containsKey(arr[i])){
                int val = hashmap.get(arr[i]);
                val = val +1;
                hashmap.put(arr[i],val);
            }
            else{
                hashmap.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hashmap.entrySet()){
            int key = e.getKey();
            int val = e.getValue();
            
            max_heap.add(val);
            
        }
        int counter=0;
        while(!max_heap.isEmpty()){ 
             int freq = max_heap.poll();
             n = n-freq;
              counter++;
          
             if(n<=m){
                 break;
             }
            
        }
       return counter;
        
    }
}