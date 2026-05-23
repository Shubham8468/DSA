class Solution {
    public int countSquares(int[][] arr) {
        int m=arr.length,n=arr[0].length,count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    continue;
                }
                if(i>0 && j>0){
                 arr[i][j]+=Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                }
                count+=arr[i][j];
            }
        }
        return count;
        
    }
}