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
    public int ans;
    public int k2;

    public void inorder(TreeNode root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        k2--;
        if(k2==0){
            ans=root.val;
        }
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        k2=k;
        ans=-1;
        inorder(root);
        return ans;
        
    }
}