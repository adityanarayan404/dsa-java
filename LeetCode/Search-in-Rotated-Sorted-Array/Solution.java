1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while(left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if(nums[mid] == target) {
10                return mid;
11            }
12
13            if(nums[mid] >= nums[left]) {
14
15                if(nums[left] <= target && target < nums[mid]) {
16                    right = mid - 1;
17                } 
18                else {
19                    left = mid + 1;
20                }
21
22            } 
23            else {
24
25                if(nums[mid] < target && target <= nums[right]) {
26                    left = mid + 1;
27                }
28                else {
29                    right = mid - 1;
30                }
31            }
32        }
33
34        return -1;
35    }
36}