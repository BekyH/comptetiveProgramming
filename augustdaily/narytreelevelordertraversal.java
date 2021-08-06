import java.util.*;
public class narytreelevelordertraversal{
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
           if(root==null){
               return res;
           }
           list.add(root.val);
           res.add(list);
           deque.add(root);
           while(!deque.isEmpty()){
               int size = deque.size();
               List<Integer> lst = new ArrayList<>();
               for(int i=0;i<size;i++){
                Node n = deque.poll();
                List<Node> ls = n.children;
                 for(Node child:ls){
                     lst.add(child.val);
                     deque.add(child);
                 }
               }
               if(lst.size()>0){
                    res.add(lst);
               }
              
           }
           return res;
       }
   }

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
