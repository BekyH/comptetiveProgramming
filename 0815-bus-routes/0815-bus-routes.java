class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> visited_stops = new HashSet<>(); 
        Set<Integer> visited_routes = new HashSet<>();
        int ans = 0;
        for(int i=0;i<routes.length;i++){
            for(int stop:routes[i]){
                if(graph.containsKey(stop)){
                    List<Integer> lt = graph.get(stop);
                    lt.add(i);
                    graph.put(stop,lt);
                }
                else{
                    List<Integer> lst = new ArrayList<>();
                    lst.add(i);
                    graph.put(stop,lst);
                }
            }
        }
     //   System.out.println(graph);
      // int [] start = {source,0};
        deque.add(source);
        while(!deque.isEmpty()){
            int size = deque.size();
            for(int i=0;i<size;i++){
                int stop = deque.poll();
                
                if(stop==target){
                    return ans;
                }
                List<Integer> routess = graph.get(stop);
                
                for(int route:routess){
                    if(visited_routes.contains(route)){
                        continue;
                    }
                    for(int st:routes[route]){
                        if(!visited_stops.contains(st)){
                            deque.add(st);
                            visited_stops.add(st);
                        }
                    }
                    visited_routes.add(route);
                }
                
            }
            ans++;
        }
        
        
        return -1;
    }
}