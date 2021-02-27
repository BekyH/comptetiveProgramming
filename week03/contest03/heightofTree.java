package com.company;

public class heightofTree {
//    public static int height(Node root) {
//        return getHeight(root)-1;
//
//
//    }
//    public static int getHeight(Node root){
//        if(root==null){
//            return 0;
//        }
//        int left = getHeight(root.left);
//        int right = getHeight(root.right);
//        return Math.max(left,right) + 1;
//
//
//    }
public static int height(Node root) {
    int h = getHeight(root);
    return h;


}
    public static int getHeight(Node node){

        int leftHeight = 0;
        int rightHeight = 0;
        if(isLeafNode(node)){
            return Math.max(leftHeight,rightHeight);
        }
        if(node.left!=null){
            leftHeight = 1 + getHeight(node.left);

        }
        if(node.right!=null){
            rightHeight = 1 + getHeight(node.right);
        }
        return Math.max(leftHeight,rightHeight);
    }

}
class Node {
    int data;
    Node left;
    Node right;
}

