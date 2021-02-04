package com.company;

public class heightofTree {
    public static int height(Node root) {
        return getHeight(root)-1;


    }
    public static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left,right) + 1;


    }
}
class Node {
    int data;
    Node left;
    Node right;
}

