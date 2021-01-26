public class sameTree {
    boolean isame=false;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null &&q==null){
            isame = true;
            return isame;
        }
        else{
            isame = isEqual(p,q);
        }
        return isame;
    }
    public boolean  isEqual(TreeNode p, TreeNode q){
        if(p!=null &&  q!=null){
            if(p.val==q.val){
                isame = true;
                isEqual(p.left,q.left);
                if(isame==false){
                    isame = false;
                    return isame;
                }
                isEqual(p.right,q.right);
            }
            else{
                isame = false;
                return isame;
            }
        }

        if(p==null && q!=null){
            isame = false;

        }
        if(q==null && p!=null){
            isame = false;

        }











        return isame;
    }
}

   class TTreeNode {
      int val;
      TTreeNode left;
      TTreeNode right;
      TTreeNode() {}
      TTreeNode(int val) { this.val = val; }
      TTreeNode(int val, TTreeNode left, TTreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}


