import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BTrightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        int level = 0;
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();


            for(int i = 0;i<size;i++){
                TreeNode node = deque.poll();
                if(result.size()>level){
                    result.remove(level);
                    result.add(level,node.val);
                }
                else{
                    result.add(node.val);
                }
                if(node.left!=null){
                    deque.add(node.left);

                }
                if(node.right!=null){
                    deque.add(node.right);
                }
            }

            level++;


        }
        System.out.println(level);
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

