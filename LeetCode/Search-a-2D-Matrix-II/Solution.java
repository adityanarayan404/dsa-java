1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int r = 0;
7        int c = n-1;
8
9        while(r<m && c >=0){
10            if(matrix[r][c] == target){
11                return true;
12            }
13            else if(matrix[r][c] > target){
14                c-=1;
15
16            }
17            else{
18                r += 1;
19
20            }
21        }
22        return false;
23    }
24}