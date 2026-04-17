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
  public class Pair{
        int sum;
        int index;
        Pair(int sum,int index){
            this.sum=sum;
            this.index=index;
        }
    }
    
    
    
    
    public int maxLevelSum(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);
    Pair ans = null;
    int level = 1;

    while (!q.isEmpty()) {
        int size = q.size();
        int sum = 0;

        for (int j = 0; j < size; j++) {
            TreeNode node = q.poll();
            sum += node.val;
            if (node.left != null)  q.offer(node.left);
            if (node.right != null) q.offer(node.right);
        }

        if (ans == null || ans.sum < sum) {
            ans = new Pair(sum, level);
        }
        level++;
    }

    return ans.index;
}
}