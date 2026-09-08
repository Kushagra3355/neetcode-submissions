/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode lca_lf = lowestCommonAncestor(root.left, p, q);
        TreeNode lca_rt = lowestCommonAncestor(root.right, p, q);

        if(lca_lf==null){
            return lca_rt;
        }
        if(lca_rt ==null){
            return lca_lf;
        }

        return root;
    }
}
