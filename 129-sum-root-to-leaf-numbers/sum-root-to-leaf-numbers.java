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
    public void helper(TreeNode root,int path,int[] sum){
        if(root==null){
            return ;
        }
        path=path*10 +root.val;
        if(root.left==null && root.right==null){
            sum[0]+=path;
        }
        helper(root.left,path,sum);
        helper(root.right,path,sum);
    }
    public int sumNumbers(TreeNode root) {
        int[] sum={0};
        helper(root,0,sum);
        return sum[0];
    }
}