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
    int sum=0;
    public void reversInorder(TreeNode  root){
        if(root==null){
            return ;
        }
        reversInorder(root.right);
        int value=root.val;
        root.val+=sum;
        sum+=value;
        reversInorder(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
     
        reversInorder(root);
        return root;
    }
}