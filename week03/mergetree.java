public class mergetree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t3 = null;
        if(t1==null && t2==null){
            return null;
        }
        if(t1!=null && t2!=null){
            int x = t1.val + t2.val;
            t3 = new TreeNode(x);

            t3.left = mergeTrees(t1.left,t2.left);
            t3.right = mergeTrees(t1.right,t2.right);
            return t3;
        }
        if(t1==null && t2!=null){
            return t2;
        }
        if(t2==null && t1!=null){
            return t1;
        }


        return t3;
    }


}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
