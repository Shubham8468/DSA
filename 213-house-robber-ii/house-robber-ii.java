class Solution {
    private int robRange(int[] arr, int start, int end) {
    int[] dp = new int[end - start + 1];
    dp[0] = arr[start];
    dp[1] = Math.max(arr[start], arr[start + 1]);
    for (int i = 2; i <= end - start; i++) {
        dp[i] = Math.max(arr[start + i] + dp[i-2], dp[i-1]);
    }
    return dp[end - start];
}

public int rob(int[] arr) {
    int n = arr.length;
    if (n == 1) return arr[0];
    if (n == 2) return Math.max(arr[0], arr[1]);
    return Math.max(robRange(arr, 0, n-2), robRange(arr, 1, n-1));
}
}