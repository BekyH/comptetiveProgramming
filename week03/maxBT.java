import sun.security.krb5.internal.crypto.Aes128;

import javax.print.attribute.standard.NumberUp;
import java.util.Arrays;

public class maxBT {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return null;

        }
        if(nums.length==1){
            return new TreeNode(nums[0]);

        }


        int maxIndex = findMax(nums);
        int max = nums[maxIndex];
        TreeNode treeNode = new TreeNode(max);
        treeNode.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,maxIndex));
        treeNode.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,maxIndex+1, nums.length));



        return treeNode;
    }
    public int findMax(int[] nums){

        int max = nums[0];
        int indexOfMax = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                indexOfMax = i;
            }

        }
        return indexOfMax;

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

