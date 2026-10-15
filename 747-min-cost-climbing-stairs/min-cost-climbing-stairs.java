class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp= new int[n];
        int firstSum=cost[0];
        int secoundSum=cost[1];
        for(int i=2;i<n;i++){
            int current=cost[i]+Math.min(firstSum,secoundSum);
            firstSum=secoundSum;
            secoundSum=current;
        }
        return Math.min(firstSum,secoundSum);

    }
}