import java.util.ArrayList;
import java.util.List;

public class TreesNode {
    public static void main(String args[]){

    }
    int val;
    TreesNode left;
    TreesNode right;
    TreesNode() {}
    TreesNode(int val) { this.val = val; }
    TreesNode(int val, TreesNode left, TreesNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

class Solution {
    List<Integer> res;
    public List<Integer> postorderTraversal(TreesNode root) {
        List<Integer> res = new ArrayList<>();

        traverse(root,res);

        return res;


    }
    public void traverse(TreesNode root, List<Integer>res){
        if(root!=null) {
            traverse(root.left, res);

            traverse(root.right, res);
            res.add(root.val);

        }
    }
    public TreesNode searchBST(TreesNode root, int val) {
        TreesNode current = root;
        while(current.val!=val){
            if(current!=null){
                if(current.val>val){
                    current = current.left;
                }
                else{
                    current = current.right;
                }
                if(current==null){
                    return null;
                }

            }

        }

        return current;
    }

}