class Solution {
    public int climbStairs(int n) {
          

        //   if(n <= 2){
        //     return n;
        //   }
        //     return climbStairs(n-1) + climbStairs(n-2);
        /////////////////////--///////////////////////

        if(n<=2){
            return n;
        }
        int prev0 = 1;
        int prev1 = 2;

        for(int i=3; i<=n; i++){
            int temp = prev0 + prev1;
            prev0 = prev1;
            prev1 = temp;
        }
        return prev1;

    }
}