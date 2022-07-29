class Solution {
    public int maximumDetonation(int[][] bombs) {
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        int max = 0;
        int n = bombs.length;
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double x = bombs[i][0]-bombs[j][0];
                double y = bombs[i][1]-bombs[j][1];
                double r1  = bombs[i][2];
                double r2 = bombs[j][2];
                double distance = x*x + y*y;
                if(distance<=(r1*r1)){
                    graph.get(i).add(j);
                }
                if(distance<=(r2*r2)){
                    graph.get(j).add(i);
                }
            }
        }
        for(int i=0;i<n;i++){
            boolean [] visited = new boolean[n];
            int[] count = new int[1];
            dfs(graph,visited,i,count);
            max = Math.max(max,count[0]);
        }
        return max;
    }
    public void dfs(HashMap<Integer,List<Integer>> graph,boolean [] visited,int node,int [] count){
        visited[node] = true;
        count[0]++;
        List<Integer> children = graph.get(node);
        for(int child:children){
            if(!visited[child]){
                dfs(graph,visited,child,count);
            }
        }
    }
}