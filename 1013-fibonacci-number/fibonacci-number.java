class Solution {
    public int fib(int n) {
        int[] dp=new int[n+1];
        return helper(dp,n);
    }
    public int helper(int[] dp,int n){
        if(n<=1)return n;
        if(dp[n]!=0){
            return dp[n];
        }
        int ans=helper(dp,n-1)+helper(dp,n-2);
        dp[n]=ans;
        return ans;
    }
}