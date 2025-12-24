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
    public void Revinorder(TreeNode root, ArrayList<TreeNode> arr ){
        if(root==null){
            return ;
        }
        Revinorder(root.right,arr);
        arr.add(root);
        Revinorder(root.left,arr);
    }
    public TreeNode bstToGst(TreeNode root) {
        ArrayList<TreeNode> arr=new ArrayList<>();
        Revinorder(root,arr);
        
        int sum=0;
        for(int i=0;i<arr.size();i++){
             int temp=arr.get(i).val;
             arr.get(i).val+=sum;
             sum+=temp;
        }
        return root;
        
    }
}