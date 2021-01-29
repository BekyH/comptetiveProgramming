public class leastCommonAncestor {
    TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int p_val = p.val;
        int q_val = q.val;
        int root_val = root.val;
        if (root_val > p_val && root_val > q_val){
            lowestCommonAncestor(root.left, p, q);
        }
        else if(root_val < p_val && root_val < q_val){
            lowestCommonAncestor(root.right, p, q);
        }
        else{
            lca = root;
            return lca;
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
