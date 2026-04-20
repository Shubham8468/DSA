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
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        if(root==null){
            return null;
        }
        int leftHeight=getDepth(root.left);
        int rightHeight=getDepth(root.right);
        if(leftHeight ==rightHeight){
            return root;
        }
        else{
            if(leftHeight > rightHeight){
               return  subtreeWithAllDeepest(root.left);
            }
            else{
               return  subtreeWithAllDeepest(root.right);
            }
        }
       
    }
    public int getDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return  1+Math.max(getDepth(root.left),getDepth(root.right));
    }
}