class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer,List<Integer>> graph = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int [] edge:adjacentPairs){
            int u = edge[0];
            int v = edge[1];
            graph.putIfAbsent(u,new ArrayList<>());
            graph.putIfAbsent(v,new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
            
        }
        int start = 0;
        for(Map.Entry<Integer,List<Integer>> e:graph.entrySet()){
            if(e.getValue().size()==1){
                start =e.getKey();
                break;
            }
        }
        dfs(start,result,visited,graph);
        int [] res = new int[result.size()];
        int index = 0;
        for(int num:result){
            res[index++] = num;
        }
        
        
       return res; 
     
    }
    public void dfs(int start,List<Integer> result,HashSet<Integer> visited,HashMap<Integer,List<Integer>> graph){
         visited.add(start);
         result.add(start);
        List<Integer> children = graph.get(start);
        for(int child:children){
            if(!visited.contains(child)){
                dfs(child,result,visited,graph);
            }
        }
    }
}
