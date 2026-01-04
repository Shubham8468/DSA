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
    public boolean isValidBST(TreeNode root) {
        TreeNode curr=root;
        long pre=Long.MIN_VALUE;
        while(curr!=null){
            if(curr.left==null){
                if(curr.val <=pre){
                    return false;
                }
                 pre=curr.val;
                 curr=curr.right;
            }
           
            else{
            TreeNode pred=curr.left;
            while(pred.right!=null && pred.right!=curr){
                pred=pred.right;
            }
            if(pred.right==null){//link
                pred.right=curr;
                curr=curr.left;
            }
            else{
                pred.right=null;
                if(curr.val <=pre)return false;
                pre=curr.val;
                curr=curr.right;
            }
            }
        }
        return true;
    }
}