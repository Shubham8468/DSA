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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public List<Integer> solver (TreeNode root,int n,List<Integer> arr){
        if(root==null){
            return null;
        }
        if(n==1){
            arr.add(root.val);
        }
        solver(root.left,n-1,arr);
        solver(root.right,n-1,arr);
        return arr;
    }





    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new  ArrayList<>();
        int level=height(root);
        for(int i=1;i<=level;i++){
            List<Integer> arr=new ArrayList<>();
            solver(root,i,arr);
            ans.add(arr);
        }
        return ans;
        
    }
    

}