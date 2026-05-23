class Solution {
    public int fib(int n) {
        if(n<=0) return n;
        int[] dp=new int[3];
        if(n==1 || n==2){
            return 1;
        }
        dp[0]=0;
        dp[1]=1;
        for(int i=2 ;i<=n ;i++){
            dp[2]=dp[0]+dp[1];
            dp[0]=dp[1];
            dp[1]=dp[2];
        }
        return dp[2];
    }
}