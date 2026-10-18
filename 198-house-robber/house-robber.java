class Solution {
    public int helper(int[] dp,int i,int[] nums){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+helper(dp,i+2,nums);
        int skip=helper(dp,i+1,nums);
        return dp[i]=Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(dp,0,nums);
        
    }
}