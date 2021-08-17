//import java.util.*;
  //Definition for a binary tree node.
   class TreeNodes {
      int val;
      TreeNodes left;
      TreeNodes right;
      TreeNodes() {}
      TreeNodes(int val) { this.val = val; }
      TreeNodes(int val, TreeNodes left, TreeNodes right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
public class goodNodesinBT {
    //brute force
    // public int goodNodes(TreeNodes root) {
    //     int[] counter =  new int[1];
    //     List<Integer> list =  new ArrayList<>();
          
          
    //     dfs(root,list,counter);
    //       return counter[0];
          
    //   }
    //   public void dfs(TreeNodes root,List<Integer> list,int [] counter){
    //       if(root==null){
    //           return;
    //       }
    //       list.add(root.val);
    //       int val = Collections.max(list);
    //       if(root.val>=val){
    //           counter[0]++;
    //       }
          
    //       dfs(root.left,list,counter);
    //       dfs(root.right,list,counter);
         
    //       list.remove(list.size()-1);
    //   }
          
    //optimal
    public int goodNodes(TreeNodes root) {
        int[] counter =  new int[1];
        int max = Integer.MIN_VALUE;
        dfs(root,max,counter);
          return counter[0];
          
      }
      public void dfs(TreeNodes root,int max,int [] counter){
          if(root==null){
              return;
          }
         
          if(root.val>=max){
              max = root.val;
              counter[0]++;
          }
          
          dfs(root.left,max,counter);
          dfs(root.right,max,counter);
          
              }    

}

