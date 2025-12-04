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
    public int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        level(root);
        return max;
    }
    public int level(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftLevel=level(root.left);
        int rightLevel=level(root.right);
        max=Math.max(max,leftLevel+rightLevel);
        return 1+Math.max(leftLevel,rightLevel);
       
    }
}