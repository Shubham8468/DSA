class Solution {
    public int maximumCount(int[] arr) {
        int pos=0;
        int neg=0;
        for(int n:arr){
            if(n>0){
                pos++;
            }
            else if(n==0){
                
            }
            else{
                neg++;
            }
        }
        return Math.max(pos,neg);

    }
}