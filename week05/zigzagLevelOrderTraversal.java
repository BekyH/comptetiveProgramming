import java.util.*;

public class zigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        deque.add(root);
        List<Integer> rootlist = new ArrayList<>();
        rootlist.add(root.val);
        result.add(rootlist);
        int level = 1;
        while(!deque.isEmpty()){
            int size= deque.size();
            for(int i = 0;i<size;i++){
                TreeNode node = deque.poll();
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }
            level++;
            if(deque.isEmpty()){
                break;
            }
            if(level%2==0){
                Iterator<TreeNode> it = deque.descendingIterator();
                List<Integer> list = new ArrayList<>();
                while(it.hasNext()){
                    list.add(it.next().val);
                }
                result.add(list);
            }
            else if(level%2==1){
                List<Integer> list = new ArrayList<>();
                for(TreeNode node:deque){
                    list.add(node.val);
                }
                result.add(list);
            }



        }
        return result;
    }
}
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
