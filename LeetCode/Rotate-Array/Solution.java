1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k%n;
5
6        int [] temp = new int [n];
7
8        for(int i = 0; i<n; i++){
9            int newIndex = (i+k)%n;
10            temp[newIndex] = nums[i];
11        }
12        for(int i = 0; i<n; i++){
13            nums[i] = temp[i];
14
15        }
16    }
17}