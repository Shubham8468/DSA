class Solution {
    public int helper(int[] arr,int sum,int[][] dp,int i){
        if(i==arr.length){
            if(sum==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
        int skip=helper(arr,sum,dp,i+1);
        if(sum-arr[i]<0){
            return dp[i][sum]= skip;
        }
        int take=helper(arr,sum-arr[i],dp,i+1);
        return dp[i][sum]=skip|take;
    }




    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele: nums){
            sum+=ele;
        }
        if(sum%2!=0){
            return false;
        }
        int[][] dp= new int[nums.length][sum+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j]=-1;
            }
        }
        int a = helper(nums,sum/2,dp,0);
        if(a==1){
            return true;
        }
        else{
            return false;
        }

    }
}