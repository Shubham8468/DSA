class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);
        return ans;
    }
    private int findFirst(int[] nums, int target){
        int idx=-1;
        int first=0;
        int last=nums.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(target<=nums[mid]){
                last=mid-1;
            }
            else {
                first=mid+1;
            }
            if(target==nums[mid]){
                idx=mid;
            }
        }
        return idx;
    }
    private int findLast(int[] nums, int target){
        int idx=-1;
        int first=0;
        int last=nums.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(target<nums[mid]){
                last=mid-1;
            }
            else {
                first=mid+1;
            }
            if(nums[mid]==target){
                idx=mid;
            }
        }
        return idx;
        
    }
}