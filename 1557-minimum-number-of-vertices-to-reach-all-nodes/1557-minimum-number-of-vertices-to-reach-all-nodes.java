class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int [] indegree = new int[n];
        List<Integer> result = new ArrayList<>();
        for(List<Integer> edge:edges){
             int node1 = edge.get(0);
             int node2 = edge.get(1);
             indegree[node2]++;
                                  
        }
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                result.add(i);
            }
        }
        
        return result;
    }
}