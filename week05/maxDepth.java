import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class maxDepth {
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
    public int maxDepth(Node root) {

        if(root==null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }

        Deque<Node> deque = new ArrayDeque<>();
        deque.add(root);
        int maxDepth = 0;

        while(!deque.isEmpty()){
            int size = deque.size();

            for(int i = 0;i<size;i++){
                Node node = deque.poll();

                for(Node child:node.children){
                    deque.add(child);
                }

            }

            maxDepth++;

        }

        return maxDepth;
    }

};
