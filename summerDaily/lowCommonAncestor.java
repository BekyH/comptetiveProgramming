public class lowCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca=null;
     return dfs(root,p.val,q.val,lca);
     
 }
 public TreeNode dfs(TreeNode root, int p_val, int q_val, TreeNode lca){
         if(root.val>p_val && root.val>q_val){
             lca=dfs(root.left,p_val,q_val,lca);
         }
         else if(root.val<p_val && root.val<q_val){
             lca=dfs(root.right,p_val,q_val,lca);
         }
         else{
             lca = root;
         }
     
     return lca;
 }
      
}

  class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
    