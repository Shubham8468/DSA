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
    public void helper(TreeNode root,int path){
        if(root==null){
            return ;
        }
        path=path*10 +root.val;
        if(root.left==null && root.right==null){
            sum+=path;
        }
        helper(root.left,path);
        helper(root.right,path);
    }
    public int sumNumbers(TreeNode root) {

        helper(root,0);
        return sum;
    }
}