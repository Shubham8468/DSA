class Solution {
    public int minCost(int[] arr , int n,int[] dp){
       if(n==0 || n==1){
           return arr[n];
       }
       if(dp[n]>=0){
           return dp[n];
       }
       int mincost=arr[n]+Math.min(minCost(arr,n-1,dp),minCost(arr,n-2,dp));
       dp[n]=mincost;
       return mincost;
   }
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
      return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
    }
}