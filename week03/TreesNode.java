

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