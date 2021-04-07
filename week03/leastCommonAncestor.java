public class leastCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return helper(root, p.val, q.val, new TreeNode[1]);

    }

    public TreeNode helper(TreeNode root, int p_val, int q_val, TreeNode[] lca) {
        if (p_val < root.val && q_val < root.val) {
            helper(root.left, p_val, q_val, lca);
        } else if (p_val > root.val && q_val > root.val) {
            helper(root.right, p_val, q_val, lca);
        } else {
            lca[0] = root;

        }
        return lca[0];
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
