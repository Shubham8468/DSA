/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long lo=1;
        long hi=n;
        long result=n;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(isBadVersion((int)mid)){
                result=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return (int)result;
        
    }
}