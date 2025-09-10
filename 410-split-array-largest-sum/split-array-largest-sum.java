class Solution {

    public boolean check(int[] nums, int k, int val){
        int count = 1;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(sum + nums[i] > val){
                count++;
                sum = nums[i];
            }else{
                sum += nums[i];
            }
        }

        return count <= k;
    }

    public int splitArray(int[] nums, int k) {
        int start = Integer.MIN_VALUE;
        int end = 0;

        for(int i = 0; i< nums.length; i++){
            start = Math.max(nums[i], start);
            end += nums[i];
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if(check(nums, k, mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return start;
    }
}