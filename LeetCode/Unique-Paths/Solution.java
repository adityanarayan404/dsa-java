1class Solution {
2    public int uniquePaths(int m, int n) {
3        
4        int[][] dp = new int[m][n];
5        return countPaths(m-1,n-1,dp);
6    }
7    int countPaths(int row, int col, int[][] dp){
8        if(row == 0 || col==0){
9            return 1;
10        }
11
12        if(dp[row][col] != 0){
13            return dp[row][col];
14        }
15       dp[row][col] = countPaths(row-1,col,dp) + countPaths(row,col-1,dp);
16       return dp[row][col];
17    }
18}