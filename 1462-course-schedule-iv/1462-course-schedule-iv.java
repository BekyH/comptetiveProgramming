class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Boolean> result = new ArrayList<>();
         HashMap<Integer,List<Integer>> map = new HashMap<>();
         boolean [][] is_pre = new boolean[numCourses][numCourses];
        
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        }
    
        for(int [] edge:prerequisites){
            map.get(edge[0]).add(edge[1]);
            
            
        }
        for(int i=0;i<numCourses;i++){
            Deque<Integer> deque = new ArrayDeque<>();
            boolean [] visited = new boolean[numCourses];
            deque.add(i);
            visited[i] = true;
            while(!deque.isEmpty()){
                  int node = deque.poll();
                  List<Integer> children = map.get(node);
                  for(int child:children){
                       if(!visited[child]){
                           is_pre[i][child] = true;
                           visited[child] = true;
                           deque.add(child);
                       }
                  }
            }
        }
            for(int [] query:queries){
                int u = query[0];
                int v = query[1];
                if(is_pre[u][v]){
                    result.add(true);
                }
                else{
                    result.add(false);
                }
            }
        

       
      
        return result;
        
    }
}