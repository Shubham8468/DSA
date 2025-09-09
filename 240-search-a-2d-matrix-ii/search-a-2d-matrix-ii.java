class Solution {
    public boolean searchMatrix(int[][] arr, int tar) {
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==tar){
                return true;
            }
            else if(arr[row][col]<tar){

                row++;
            }
            else{
                col--;
            }
        }
        return false;
        
    }
}