import java.util.ArrayList;
import java.util.List;

public class minDiff {
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(root==null){
            return 0;
        }
        inorder(root,arrayList);
        int mindiff = Integer.MAX_VALUE;
       for(int i = 1;i<arrayList.size();i++){
            mindiff = Math.min(Math.abs(arrayList.get(i)-arrayList.get(i-1)),mindiff);
       }
       return mindiff;
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

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

