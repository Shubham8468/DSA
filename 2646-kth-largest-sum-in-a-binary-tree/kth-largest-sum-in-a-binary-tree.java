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
    public long kthLargestLevelSum(TreeNode root, int k)  {
        Queue<TreeNode> q=new LinkedList<>();
        PriorityQueue<Long> p=new PriorityQueue<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0l;
            for(int i=1;i<=size;i++){
                TreeNode node= q.poll();
                sum+=node.val;
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
            }
            p.offer(sum);
            if(p.size()>k){
                p.poll();
            }
        }
        if(p.size() < k){
            return -1;
        }
        return p.peek();
    }
}