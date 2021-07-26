import java.util.*;
public class convertarraytoBST {
    public TreesNode sortedArrayToBST(int[] nums) {
        List<Integer> list=  new ArrayList<>();
      for(int i:nums){
          list.add(i);
      }
      return buildTree(list);
     
      
      
  }
  public TreesNode buildTree(List<Integer> list){
      if(list.size()==0){
          return null;
      }
       List<Integer> left = new ArrayList<>();
      List<Integer> right = new ArrayList<>();
      int mid = list.size()/2;
      for(int i=0;i<mid;i++){
          left.add(list.get(i));
      }
      
      for(int j=mid+1;j<list.size();j++){
          right.add(list.get(j));
      }
      TreesNode root = new TreesNode(list.get(mid));
      root.left = buildTree(left);
      root.right = buildTree(right);
      return root;
      
  }
}

class TreesNode {
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
    
