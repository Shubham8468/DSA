class Solution {
    public int minCont(int[] cost, int n , int[] dp){
        if(n==0 || n==1){
            return cost[n];
        }
        if(dp[n]>=0){
            return dp[n];
        }
        int mincost=cost[n]+Math.min(minCont(cost,n-1,dp),minCont(cost,n-2,dp));
        dp[n]=mincost;
        return mincost;
    }


    public int minCostClimbingStairs(int[] cost) {
         int n= cost.length;
        int[] dp= new int[n];
        Arrays.fill(dp,-1);
       
        return Math.min(minCont(cost, n-1,dp),minCont(cost, n-2,dp) );
    }
}