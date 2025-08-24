class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                lo=mid;
            }
            else{
                hi=mid;
            }
        }
        return -1;
    }
}