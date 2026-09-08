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
    public List<Integer> helper(TreeNode root, List<Integer> list){
        if(root==null){
            return null;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);

        return list;
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = helper(root, list);

        //check if sorted , then return true
        
        for(int i =0; i<list.size()-1; i++){
            if(list.get(i)>list.get(i+1) || list.get(i)==list.get(i+1)){
                return false;
            }
        }
        return true;

    }
}
