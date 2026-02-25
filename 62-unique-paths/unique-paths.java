class Solution {
    public int path(int sr,int sc, int m,int n,int[][] dp){
        //base case
        if(sr>=m || sc>=n){
            return 0;
        }
        if(sr==m-1 && sc==n-1 ){
            return 1;
        }
        if(dp[sr][sc]!=-1){
            return dp[sr][sc];
        }
        int rightWay=path(sr,sc+1,m,n,dp);
        int leftWay=path(sr+1,sc,m,n,dp);
        return dp[sr][sc]=rightWay+leftWay;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,m,n,dp);
        
    }
}