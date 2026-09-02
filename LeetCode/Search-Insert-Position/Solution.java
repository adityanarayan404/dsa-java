1class Solution {
2    public int searchInsert(int[] nums, int target) {
3
4        for(int i = 0; i < nums.length; i++) {
5
6            if(nums[i] >= target) {
7                return i;
8            }
9        }
10
11        return nums.length;
12    }
13}