class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        int [] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            map.put(i,new ArrayList<>());
        
        }
        for(int [] edge:prerequisites){
            map.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
        }
        
       
        Deque<Integer> deque = new ArrayDeque<>();
        int num = 0;
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                deque.add(i);
            }
        }
        while(!deque.isEmpty()){
            int node = deque.poll();
            num++;
            List<Integer> children = map.get(node);
            for(int child:children){
                indegree[child]--;
                if(indegree[child]==0){
                    deque.add(child);
                }
            }
        }
        return num==numCourses;
    }
}