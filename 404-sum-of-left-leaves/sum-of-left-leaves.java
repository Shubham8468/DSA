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
     public int sumOfLeftLeaves(TreeNode root) {
       if(root==null) return 0;
       Queue<TreeNode>que=new LinkedList<>();
       que.add(root);
       int sum=0;

       while(!que.isEmpty()){
          TreeNode curr=que.poll();
          if(curr.left!=null){
             if(curr.left.left==null && curr.left.right==null)sum+=curr.left.val;
             que.add(curr.left);
          }
          if(curr.right!=null)que.add(curr.right);
       }

       return sum;
    }
}