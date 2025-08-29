class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        int lo=0,hi=n-1;
        if(arr.length==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-2]!=arr[n-1]){
            return arr[n-1];
        }
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            int s=mid,f=mid;
            if(arr[mid]==arr[mid-1]){
                f=mid-1;
            }
            else{
                s=mid+1;
            }
            int leftCount=f-lo;
            
            if(leftCount%2==0){
                lo=s+1;
            }
            else{
                hi=s-1;
            }
        }
        return 0;
    }
}