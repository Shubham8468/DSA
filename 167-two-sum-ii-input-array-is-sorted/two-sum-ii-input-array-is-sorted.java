class Solution {
    public int[] twoSum(int[] arr, int tar) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
       
        while(lo<hi){
            int sum=arr[lo]+arr[hi];
            if(sum==tar){
                return new int[]{lo+1,hi+1};
            }
            else if(sum>tar){
                hi=hi-1;
            }
            else{
                lo=lo+1;
            }

        }
        return new int[]{lo+1,hi+1};
    }
}