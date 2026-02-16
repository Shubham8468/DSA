class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        boolean found=false;
        for(int i=0 ;i<nums1.length;i++){
            found=false;
            for(int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    found=true;
                   
                }
                if(found && nums2[j] > nums1[i]){
                    ans[i]=nums2[j];
                     break;
                }
            }

        }
        for(int i=0 ;i<ans.length;i++){
            if(ans[i]==0){
                ans[i]=-1;
            }
        }
        return ans;

    }
}