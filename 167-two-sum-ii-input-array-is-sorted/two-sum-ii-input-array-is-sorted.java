class Solution {
    public int[] twoSum(int[] arr, int tar) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        int[] ans=new int[2];
        while(lo<hi){
            int sum=arr[lo]+arr[hi];
            if(sum==tar){
                ans[0]=lo+1;
                ans[1]=hi+1;
                break;
            }
            else if(sum>tar){
                hi=hi-1;
            }
            else{
                lo=lo+1;
            }

        }
        return ans;
    }
}