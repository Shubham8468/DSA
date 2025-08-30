class Solution {
    public int search(int[] arr, int target) {
        int lo=0;
        int hi=arr.length-1;
        if(arr[0]==target){
            return 0;
        }
        if(arr[arr.length-1]==target){
            return arr.length-1;
        }
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==target){
                return mid;
            }
            
            //lo to mid is shorted
            else if(arr[lo]<=arr[mid]){
                if(arr[lo]<=target && target<arr[mid]){
                    hi=mid-1;
                }
                else{
                    lo=mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[hi]){
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