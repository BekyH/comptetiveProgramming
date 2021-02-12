import java.util.ArrayDeque;
import java.util.Deque;

public class mindepthBT {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        // return dfs(root);
        return bfs(root);
    }
    public int dfs(TreeNode node){
        int minleft  = Integer.MAX_VALUE;
        int minright  = Integer.MAX_VALUE;
        if(isLeaf(node)){
            return 1;
        }
        if(node.left!=null){
            minleft=dfs(node.left);
        }
        if(node.right!=null){
            minright=dfs(node.right);
        }
        return Math.min(minleft,minright)+1;



    }
    public boolean isLeaf(TreeNode node){
        if(node.left==null && node.right==null){
            return true;
        }
        return false;
    }
    public int bfs(TreeNode root){
        if(isLeaf(root)){
            return 1;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int level = 1;
        while(!deque.isEmpty()){
            int size = deque.size();
            for(int i = 0;i<size;i++){
                TreeNode parent = deque.poll();

                if(isLeaf(parent)){

                    return level;
                }
                else{


                    if(parent.left!=null){
                        deque.add(parent.left);
                    }
                    if(parent.right!=null){
                        deque.add(parent.right);
                    }

                }

            }
            level+=1;



        }
        return level;

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

