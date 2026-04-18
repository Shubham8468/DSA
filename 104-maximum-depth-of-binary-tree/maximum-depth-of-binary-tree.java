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
    int depth=0;
    public void helper(TreeNode root,int count){
        if(root==null){
            return ;
        }
        depth=Math.max(depth,count);
        helper(root.left,count+1);
        helper(root.right,count+1);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root,1);
        
        
        return depth;
    }
}