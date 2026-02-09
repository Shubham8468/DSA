class Solution {
    public int fib(int n) {
        if(n==0)return 0;
       int a=1;
       int b=1;
       int i=1;
       while(i!=n){
        int next=a+b;
        a=b;
        b=next;
        i++;
       }
       return a;
    }
}