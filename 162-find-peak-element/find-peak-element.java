class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        if(n==1){
            return 0;
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid==0 || mid==n-1){
                if(mid==n-1){
                return mid;
                }
               else if(arr[mid]<arr[mid+1]){
                    return mid+1;
                }
                
                else{
                    return mid;
                }
            }
            else{
                if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]){
                    return mid;
                }
                else if(arr[mid]<arr[mid+1]){
                    lo=mid+1;
                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}