/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root==null){
            return result;
        }
        deque.add(root);
        while(!deque.isEmpty()){
              int size = deque.size();
              List<Integer> lst = new ArrayList<>();
              for(int i = 0;i<size;i++){
                  Node node = deque.poll();
                  lst.add(node.val);
                   List<Node> children = node.children;
                  if(children!=null){
                      for(Node child:node.children){
                            deque.add(child);
                   }
                  }
                   
              }
            result.add(lst);
        }
        
        return result;
        
    }
}