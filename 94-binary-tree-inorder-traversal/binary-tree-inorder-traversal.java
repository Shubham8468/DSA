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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left==null){
                 ans.add(curr.val);
                 curr=curr.right;
            }
            else{
                //find predicur
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr){
                    pred=pred.right;
                  }  //link
                    if(pred.right==null){
                        pred.right=curr;
                        curr=curr.left;
                    }
                    else{
                        //unlink ans print

                        pred.right=null;
                        ans.add(curr.val);
                        curr=curr.right;
                    }
                

            }
        }
        return ans;
    }
}