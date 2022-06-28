class Solution {
    public long countPairs(int n, int[][] edges) {
        long total = 0;
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int [] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        
        HashSet<Integer> visited = new HashSet<>();
        long[] count = new long[1];
        for(int i=0;i<n;i++){
            count[0] = 0;
            if(!visited.contains(i)){
             dfs(i,graph,visited,count);
                long not_connected = n - count[0];
                total =total + count[0] * not_connected;
            }
        }
        
        return total/2;
    }
    public void dfs(int node,HashMap<Integer,List<Integer>> graph, HashSet<Integer> visited,long []count){
        count[0] = count[0]+1;
        visited.add(node);
        
        List<Integer> children = graph.get(node);
        for(int child:children){
            if(!visited.contains(child)){
                dfs(child,graph,visited,count);
            }
        }
       // return count;
    }
}