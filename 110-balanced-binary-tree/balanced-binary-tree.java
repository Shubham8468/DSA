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
    public boolean isBalanced(TreeNode root) {
         if(root==null){
            return true;
        }
        int size=height(root.left)-height(root.right);
        if(size<0){
            size=-1*size;
        }
        if(size>1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
        
        
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return (1+Math.max(height(root.left),height(root.right)));
    }
}