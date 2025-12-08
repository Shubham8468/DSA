/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root == p || root == q){
            return root;
        }
        boolean ispresentLeft=isExite(root.left,p);
        boolean ispresentRight=isExite(root.left,q);
        if(ispresentLeft && ispresentRight){
            return lowestCommonAncestor(root.left,p,q);
        }
        else if(!ispresentLeft && !ispresentRight){
            return lowestCommonAncestor(root.right,p,q);
        }
        else return root;
        
    }
    public boolean isExite(TreeNode root , TreeNode temp){
        if(root==null){
            return false;
        }
        if(root == temp){
            return true;
        }
        return isExite(root.left,temp)||isExite(root.right,temp);
    }
}