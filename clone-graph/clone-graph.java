/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        return dfs(node,new HashMap<>());
       
    }
    public Node dfs(Node node,HashMap<Node,Node> clonedGraph){
          if(node==null){
              return node;
          }
        if(clonedGraph.containsKey(node)){
            return clonedGraph.get(node);
        }
        Node copy = new Node(node.val,new ArrayList<>());
        clonedGraph.put(node,copy);
        for(Node child:node.neighbors){
            copy.neighbors.add(dfs(child,clonedGraph));
        }
        
        return copy;
    }
}