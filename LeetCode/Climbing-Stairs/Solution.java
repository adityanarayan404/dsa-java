1class Solution {
2    public int climbStairs(int n) {
3          
4
5        //   if(n <= 2){
6        //     return n;
7        //   }
8        //     return climbStairs(n-1) + climbStairs(n-2);
9        /////////////////////--///////////////////////
10
11        if(n<=2){
12            return n;
13        }
14        int prev0 = 1;
15        int prev1 = 2;
16
17        for(int i=3; i<=n; i++){
18            int temp = prev0 + prev1;
19            prev0 = prev1;
20            prev1 = temp;
21        }
22        return prev1;
23
24    }
25}