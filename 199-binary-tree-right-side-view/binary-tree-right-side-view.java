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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
         if(root==null){
            return ans;
         }
         Queue<TreeNode > q = new LinkedList<>();
         q.add(root);
         while(q.size()!=0){
            int l=q.size();
            for(int i=0;i<l;i++){
                TreeNode temp=q.peek();
                q.remove();
                if(i==l-1){
                    ans.add(temp.val);
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }

         }

        return ans;
    }
}