class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       HashMap<String,Integer> hashmap = new HashMap<>();
        
        List<String> result = new ArrayList<>();
        for(String word:words){
            if(hashmap.containsKey(word)){
                int x = hashmap.get(word).intValue();
                x = x + 1;
                hashmap.put(word,x);
            }
            else{
                hashmap.put(word,1);
            }
        }
          PriorityQueue<String> priorityqueue = new PriorityQueue<>((word1, word2) -> hashmap.get(word1).equals(hashmap.get(word2)) ? word2.compareTo(word1) : hashmap.get(word1) - hashmap.get(word2)) ;
        for(String word:hashmap.keySet()){
            priorityqueue.add(word);
            if(priorityqueue.size()>k){
                priorityqueue.poll();
            }
        }
        while(!priorityqueue.isEmpty()){
             result.add(priorityqueue.poll());
        }
        
        Collections.reverse(result);
        
    return result;
    
       
    }
    
}
