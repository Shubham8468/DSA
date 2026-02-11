class Solution {
    public int amout(int[] nums, int i ,int[] dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+amout(nums,i+2,dp);
        int skip=amout(nums,i+1,dp);
        dp[i]= Math.max(take,skip);
        return dp[i];
    }


    public int rob(int[] nums) {
        int[] dp= new int[nums.length];
        Arrays.fill(dp,-1);
        return amout(nums,0,dp);
        
    }
}