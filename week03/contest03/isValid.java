import sun.reflect.generics.tree.Tree;
import sun.rmi.server.InactiveGroupException;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isValid {

    public boolean isValidBST(TreeNode root) {
           double upperBound = Double.POSITIVE_INFINITY;
        double lowerbound = Double.NEGATIVE_INFINITY;

        return isValid(root,upperBound,lowerbound);

    }
    public boolean isValid(TreeNode root,double upperBound,double lowerBound){
        if(root==null){
            return true;
        }
        if(root.val<lowerBound || root.val>upperBound){
            return false;
        }
        boolean left = isValid(root.left,root.val,lowerBound);
        boolean right = isValid(root.right,upperBound,root.val);
        return left && right;

    }




}

class TreeNode {
    double val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(double val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
