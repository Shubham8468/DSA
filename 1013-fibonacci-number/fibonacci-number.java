class Solution {
    public int fib(int n) {
        int a=0 , i=0;
        int b=1;
        while(i!=n){
            int next=a+b;
            a=b;
            b=next;
            i++;
        }
        return a;
    }
}