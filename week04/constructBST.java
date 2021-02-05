package com.company;

import java.util.ArrayList;

public class constructBST {
        public TreeNode bstFromPreorder(int[] preorder){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int x:preorder){
                arr.add(x);
            }
            return buildTree(arr);

        }
    public TreeNode buildTree(ArrayList<Integer> preorder){

        if(preorder.size()==0){
            return null;
        }
        TreeNode root = new TreeNode(preorder.get(0));
        ArrayList<Integer> leftarr = new ArrayList<>();
        ArrayList<Integer> rightarr = new ArrayList<>();
        for(int i = 1;i<preorder.size();i++){
            if(preorder.get(i)<preorder.get(0)){
                leftarr.add(preorder.get(i));
            }
            else{
                rightarr.add(preorder.get(i));
            }
        }
        root.left = buildTree(leftarr);
        root.right = buildTree(rightarr);
        return root;
    }
    //another apporach
//    public TreeNode bstFromPreorder(int[] preorder) {
//        return buildTree(preorder,0,preorder.length-1);
//    }
//    public TreeNode buildTree(int[] preorder,int start,int end){
//        if(start>end){
//            return null;
//        }
//
//        int i;
//        for(i = start+1;i<=end;i++){
//            if(preorder[i]>preorder[start]){
//                break;
//            }
//        }
//        System.out.println(start + "," + i);
//        TreeNode root = new TreeNode(preorder[start]);
//        root.left = buildTree(preorder,start+1,i-1);
//        root.right = buildTree(preorder,i,end);
//
//        return root;
//    }

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

