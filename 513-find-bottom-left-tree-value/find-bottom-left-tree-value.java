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
    int ans=0;
    int maxdept=-1;
    public void inorder(TreeNode root, int depth){
        if(root==null)return ;
        inorder(root.left,depth+1);
        if(depth > maxdept){
            maxdept=depth;
            ans=root.val;
        }
        inorder(root.right,depth+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        inorder(root,0);
        return ans;
        
    }
}