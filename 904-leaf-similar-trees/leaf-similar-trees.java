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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      // first we apply dsf
        List<Integer> l=new ArrayList<>();
        List<Integer> ll= new ArrayList<>();
        dfs(root1,l);
        dfs(root2,ll);
        boolean ans= l.equals(ll);
        return ans;
    }
    public void dfs(TreeNode root,List<Integer> l){
        if(root==null)return;
        if(root.right==null && root.left==null){
            l.add(root.val);
        }
        dfs(root.left,l);
        dfs(root.right,l);
    }
}