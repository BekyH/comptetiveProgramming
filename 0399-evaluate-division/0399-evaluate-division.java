class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,List<Node>> graph = new HashMap<>();
        double[] ans = new double[queries.size()];
        for(int i=0;i<equations.size();i++){
            List<String> equation = equations.get(i);
            String s1 = equation.get(0);
            String s2 = equation.get(1);
            double val = values[i];
            graph.putIfAbsent(s1,new ArrayList<>());
            graph.putIfAbsent(s2,new ArrayList<>());
            Node n1 = new Node(s1,1/val);
            Node n2 = new Node(s2, val);
            graph.get(s2).add(n1);
            graph.get(s1).add(n2);
        
        }
        
        for(int j=0;j<queries.size();j++){
            List<String> query = queries.get(j);
            String s1 = query.get(0);
            String s2 = query.get(1);
        
            ans[j] = dfs(s1,s2,graph,new HashSet<>());
        }
      return ans;  
    }
    
    public double dfs(String s1,String s2,HashMap<String,List<Node>> graph,HashSet<String>visited){
        if(!graph.containsKey(s1) || !graph.containsKey(s2)){
            return -1.0;
        }
        if(s1.equals(s2)){
            return 1.0;
        }
        visited.add(s1);
        List<Node> lst = graph.get(s1);
        for(Node node:lst){
            if(!visited.contains(node.name)){
                double val = dfs(node.name,s2,graph,visited);
                if(val!=-1.0){
                    return val * node.weight;
                }
            }
        }
        
        return -1.0;
    }
}

class Node{
    String name;
    double weight;
    public Node(String name,double weight){
        this.name = name;
        this.weight = weight;
    }
}