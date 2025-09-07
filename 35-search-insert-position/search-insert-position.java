class Solution {
    public int searchInsert(int[] arr, int tar) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==tar){
                return mid;
            }
            else if(arr[mid]<tar){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return lo;
    }
}