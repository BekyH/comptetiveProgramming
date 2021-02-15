import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class averageOflevelsBT {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageList = new ArrayList<>();
        if(root.left==null && root.right==null){
            double d = root.val;
            averageList.add(d);
            return averageList;
        }
        double average = 0;
        double sum;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            sum=0;
            for(TreeNode node:deque){
                sum = sum + node.val;

            }
            average = sum/size;
            averageList.add(average);

            for(int i = 0;i<size;i++){
                TreeNode temp = deque.poll();


                if(temp.left!=null){
                    deque.add(temp.left);

                }
                if(temp.right!=null){
                    deque.add(temp.right);

                }

            }
        }
        return averageList;
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

