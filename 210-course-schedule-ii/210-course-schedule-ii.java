class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         HashMap<Integer,List<Integer>> map = new HashMap<>();
        int [] indegree = new int[numCourses];
        int [] result =new int[numCourses];
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        
        }
        for(int [] edge:prerequisites){
            map.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
        }
        
       
        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;
        for(int i=0;i<numCourses;i++){
            
            if(indegree[i]==0){
                //System.out.println(i + ":" + indegree[i]);
                deque.add(i);
            }
        }
        while(!deque.isEmpty()){
            int node = deque.poll();
          //  System.out.println(node);
            result[index++] = node;
            //num++;
            List<Integer> children = map.get(node);
            for(int child:children){
                indegree[child]--;
                if(indegree[child]==0){
                    deque.add(child);
                }
            }
        }
        return index==numCourses? result: new int[0];
    }
}