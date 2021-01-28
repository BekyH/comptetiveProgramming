public class sameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isEqual(p,q);
    }
    public boolean  isEqual(TreeNode p, TreeNode q){


        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        boolean left = isEqual(q.left,p.left);
        boolean right = isEqual(q.right,p.right);




        return left && right;

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


