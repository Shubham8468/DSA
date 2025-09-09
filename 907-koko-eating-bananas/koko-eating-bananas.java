class Solution {
    public int maxnum(int[] arr){
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public boolean eatinvalied(int[]arr,int mid,int h){
        int n=arr.length;
        int hour=0;
        for(int i=0;i<n;i++){
            hour+=arr[i]/mid;
            if(arr[i]%mid!=0){
                hour+=1;
            }
            if(hour>h){
                return false;
            }
        }
        return true;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int lo=1;
        int hi=maxnum(arr);
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(eatinvalied(arr,mid,h)){
             ans=mid;
             hi=mid-1;
            }
            else{
               lo=mid+1;
            }
        }
        return ans;
    }
}