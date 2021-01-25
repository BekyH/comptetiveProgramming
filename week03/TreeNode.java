

  public class TreeNode {
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

class solution {
    int sum = 0;
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root = new TreeNode(val);
            return root;
        }
        if(root!=null){
            if(val>root.val){
                if(root.right==null){
                    root.right = new TreeNode(val);
                }
                else{
                    insertIntoBST(root.right,val);
                }



            }
            else{
                if(root.left==null){
                    root.left = new TreeNode(val);
                }
                else{
                    insertIntoBST(root.left,val);
                }

            }
        }
        return root;



    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root!=null){
            if(root.val<=high && root.val>=low){
                sum = sum + root.val;

            }
            rangeSumBST(root.left,low,high);
            rangeSumBST(root.right,low,high);
        }
        return sum;

    }

}