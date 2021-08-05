import java.util.*;
public class pathsum {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
           dfs(root,targetSum,0,result,list);
           return result;
       }
       public void dfs(TreeNode root,int targetSum,int sum,List<List<Integer>> result,List<Integer> list){
           if(root==null){
               return;
           }
           list.add(root.val);
           List<Integer> rightlist = new ArrayList<>(list);
           sum = sum + root.val;
           if(isLeaf(root)){
               if(sum==targetSum){
                   result.add(list);
               }
           }
           dfs(root.left,targetSum,sum,result,list);
           dfs(root.right,targetSum,sum,result,rightlist);
       }
       public boolean isLeaf(TreeNode node){
           if(node.left==null && node.right==null){
               return true;
           }
           return false;
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