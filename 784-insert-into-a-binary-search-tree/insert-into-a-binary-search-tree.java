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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode temp=new TreeNode(val);
            return temp;
        }
        if(root.val>val){
            TreeNode temp=new TreeNode(val);
            if(root.left==null){
                root.left=temp;
            }
            else{
                insertIntoBST(root.left, val);
            }
        }
        else{
            TreeNode temp=new TreeNode(val);
            if(root.right==null){
                root.right=temp;
            
            }
        else{
            insertIntoBST(root.right,val);
        }
        }
        return root;
    }
}