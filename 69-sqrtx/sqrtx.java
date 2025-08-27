class Solution {
    public int mySqrt(int x) {
        long root=0;
        for(long i=1;i<=x;i++){
            if(i*i > x){
                break;
            }
            root=i;
        }
        int  ans=(int ) root;
        return ans;
        

    }
}