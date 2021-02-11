public class longestUvpath {
    int globalmax;
    public  int longestUnivaluePath(TreeNode root) {

        longestUnivaluehelper(root);


        return globalmax;
    }
    public  int longestUnivaluehelper(TreeNode node){
        if(node==null){
            return 0;
        }
        int left = longestUnivaluehelper(node.left);
        int right = longestUnivaluehelper(node.right);

        int currentLeftmax = 0;
        int currentRightmax = 0;
        if(node.left!=null && node.val==node.left.val){
            currentLeftmax += left + 1;
        }
        if(node.right!=null && node.val==node.right.val){
            currentRightmax += right + 1;
        }

        globalmax = Math.max(globalmax,currentLeftmax + currentRightmax);

        return Math.max(currentLeftmax,currentRightmax);



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
