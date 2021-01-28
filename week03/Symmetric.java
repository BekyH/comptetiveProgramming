public class Symmetric {
    boolean isSymetry = false;

    public boolean isSymmetric(TreeNode root) {
        return isSym(root, root);


    }

    public boolean isSym(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean left = isSym(q.left, p.right);
        boolean right = isSym(q.right, p.left);


        return left && right;
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
