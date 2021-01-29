package com.company;

public class invertTree {
    TreeNode temp;
    public TreeNode invertTree(TreeNode root) {

        if(root==null){
            return null;
        }
        if(root.left!=null && root.right==null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.right);
            return root;

        }
        if(root.left==null && root.right!=null){
            temp = root.right;
            root.right = root.left;
            root.left = temp;

            invertTree(root.left);
            return root;
        }
        if(root.left!=null && root.right!=null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;

        }
        invertTree(root.left);
        invertTree(root.right);
        return root;

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

