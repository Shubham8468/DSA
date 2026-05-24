class Solution {
    public boolean isPrefectSq(int n){
        int num=(int)Math.sqrt(n);
        return (num*num==n);
    }

    public int minSqure(int n,int[] dp){
        if(isPrefectSq(n)){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int count=minSqure(i*i,dp)+minSqure(n-i*i,dp);
            min=Math.min(count,min);
        }
        return dp[n]=min;
    }
    public int numSquares(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        return minSqure(n,dp);
        
    }
}