public class isValid {
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }


        if(((isLesser(root.left,root.val))) && (isGreater(root.right,root.val)) &&
                (isValidBST(root.left)) && (isValidBST(root.right))){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean isGreater(TreeNode root,int val){
        if(root==null){
            return true;
        }
        if((root.val>val) && (isGreater(root.left,val))&& (isGreater(root.right,val))) {

            return true;


        }
        else{
            return false;
        }

    }
    public boolean isLesser(TreeNode root,int val){
        if(root==null){
            return true;
        }
        if((root.val<val) && (isLesser(root.left,val))&& (isLesser(root.right,val))) {

            return true;


        }
        else{
            return false;
        }

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
