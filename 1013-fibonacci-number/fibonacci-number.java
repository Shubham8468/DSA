class Solution {
    static int[] dp;
    public int helper(int n){
        if(n<=1)return n;
        if(dp[n]!=0) return dp[n]; // us number ko return 
        int ans=helper(n-1)+helper(n-2);
        dp[n]=ans; // store tha call item;
        return ans;

    }



    public int fib(int n) {
        dp= new int[n+1];
        return helper(n);
    }
}