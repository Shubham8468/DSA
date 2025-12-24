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
    public TreeNode sortedArrayToBST(int[] arr) {
        int n=arr.length;
        return convert(arr,0,n-1);
    }
    public TreeNode convert(int[] arr ,int lo,int hi ){
        if(lo>hi){
            return null;
        }
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=convert(arr,lo,mid-1);
        root.right=convert(arr,mid+1,hi);
        return root;
    }
}