package com.company;

import java.util.ArrayList;

public class KthSmallestBT {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        helper(root,arraylist);
        return arraylist.get(k-1);
    }

    public void helper(TreeNode root,ArrayList<Integer> arraylist){
        if(root==null){
            return;
        }
        helper(root.left,arraylist);
        if(root!=null){
            arraylist.add(root.val);
        }
        helper(root.right,arraylist);
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

