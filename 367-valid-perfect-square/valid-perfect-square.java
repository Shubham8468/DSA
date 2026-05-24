class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<0){
            return false;
        }
        int n=(int)Math.sqrt(num);
        return (n*n==num);
    }
}