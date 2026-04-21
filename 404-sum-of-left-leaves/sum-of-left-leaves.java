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
     public class  Pair{
        TreeNode root;
        boolean isLeft;
        Pair(TreeNode root, boolean isLeft){
            this.root=root;
            this.isLeft=isLeft;
        }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        return bfs(root);
    }
    public int bfs(TreeNode root){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,false));
        int sum=0;
        while (!q.isEmpty()){
            int size=q.size();
            for (int i = 1; i <=size ; i++) {
                Pair temp=q.poll();
                TreeNode node=temp.root;
                int item= temp.root.val;
                if(temp.isLeft && node.left==null && node.right==null){
                    sum+=item;
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,false));
                }
                if(node.left!=null){
                    q.add(new Pair(node.left,true));
                }


            }
        }
        return sum;
    }
    
}