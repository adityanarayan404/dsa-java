1class Solution {
2    public int fib(int n) {
3        // if(n==0){
4        //     return 0;
5        // }
6        // if(n==1){
7        //     return 1;
8        // }
9         
10         if(n<=1){
11            return n;
12         }
13         return fib(n-1) + fib(n-2); 
14    }
15}