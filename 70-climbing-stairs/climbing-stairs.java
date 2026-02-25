class Solution {
    public int  clim(int[] dp ,int n ){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]>=0){
            return dp[n];
        }
        int ans= clim(dp,n-1)+clim(dp,n-2);
        dp[n]=ans;
        return  ans;
    }
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return clim(dp,n);
    }
}