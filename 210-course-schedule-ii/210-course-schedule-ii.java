class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int n = numCourses;
        int [] indegree = new int[n];
        int [] result = new int[n];
        int index = 0;
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
            
        }
        for(int [] prerequisite:prerequisites){
            graph.get(prerequisite[1]).add(prerequisite[0]);
            
            indegree[prerequisite[0]]++;
        }
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
               // System.out.println(i);
                deque.add(i);
            }
        }
                     
        while(!deque.isEmpty()){
          //  System.out.println("e");
            int current = deque.poll();
            result[index++] = current;
            List<Integer> children = graph.get(current);
            for(int child:children){
              indegree[child]--;
               // System.out.println(indegree[child]);
                if(indegree[child]==0){
                    deque.add(child);
                }
            }
        }
                     
        for(int i:indegree){
            if(i>0){
                return new int[0];
            }
        }
                     
        return result;
    }
}