/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void findParent( HashMap<TreeNode, TreeNode> map,TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            map.put(root.left,root);
        }
        if(root.right!=null){
            map.put(root.right,root);
        }
        findParent(map,root.left);
        findParent(map,root.right);
        return;


    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       List<Integer> res= new ArrayList<>();
       if(root==null || target==null)return res;
       HashMap<TreeNode, TreeNode> parendMap= new HashMap<>();
       findParent(parendMap,root);
       Queue<TreeNode> q=new LinkedList<>();
       HashSet<TreeNode> visited= new HashSet<>();
       q.add(target);
       while(!q.isEmpty()){
        int size=q.size();
        for(int i=1;i<=size;i++){
            TreeNode temp=q.poll();
             visited.add(temp);
             if(k==0){
                res.add(temp.val);
             }
             if(parendMap.containsKey(temp) && !visited.contains(parendMap.get(temp))){
                q.add(parendMap.get(temp));
             }






             if(temp.left!=null && !visited.contains(temp.left)){
                q.add(temp.left);
             }
             if(temp.right!=null && !visited.contains(temp.right)){
                q.add(temp.right);
             }
            
        }
         k--;
         if(k<0) break;

       }
      return res;
    }
}