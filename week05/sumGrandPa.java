public class sumGrandPa {
    public int sumEvenGrandparent(TreeNode root) {
        int total = 0;
        if(root==null){
            return 0;
        }
        int parent_value = root.val;
        if(root.left!=null){
            total =sumEvenGrandparenthelper(root.left,parent_value,total);
        }
        if(root.right!=null){
            total=  sumEvenGrandparenthelper(root.right,parent_value,total);
        }
        return total;

    }
    public int sumEvenGrandparenthelper(TreeNode node,int value,int total){
        if(node.left!=null){
            if(value%2==0){
                total = total + node.left.val;
            }
            total =sumEvenGrandparenthelper(node.left,node.val,total);
        }

        if(node.right!=null){
            if(value%2==0){
                total = total + node.right.val;
            }
            total  = sumEvenGrandparenthelper(node.right,node.val,total);
        }

        return total;

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
