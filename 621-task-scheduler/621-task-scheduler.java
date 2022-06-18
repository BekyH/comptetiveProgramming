class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        Deque<int[]> deque = new ArrayDeque<>();
        for(char c:tasks){
            if(map.containsKey(c)){
                int val = map.get(c);
                val = val + 1;
                map.put(c,val);
            }
            else{
                map.put(c,1);
            }
        }
        int t = 0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
               max_heap.add(e.getValue());
        }
        
        while(!max_heap.isEmpty() || !deque.isEmpty()){
            t = t +1;
            int task = 0;
            if(!max_heap.isEmpty()){
                 task = max_heap.poll();
                task = task-1;
            }
            
            if(task>0){
                int [] arr = {task,t + n};
                deque.add(arr);
                
            }
            if(!deque.isEmpty() && deque.peek()[1]==t){
                max_heap.add(deque.poll()[0]);
            }
            
        }
        
        return t;
        
    }
}