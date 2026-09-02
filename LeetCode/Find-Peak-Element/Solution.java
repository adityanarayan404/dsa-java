1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left =0;
4        int right = nums.length-1;
5
6        while(left<right){
7            int mid = left+(right-left)/2;
8
9            if(nums[mid] > nums[mid+1]){
10                right = mid;
11
12            }
13            else{
14                left = mid + 1;
15
16            }
17        }
18        return right;  // or left
19    }
20}
21//         int n = nums.length;
22
23//         for(int i = 1; i < nums.length - 1; i++) {
24//             if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
25//                 return i;
26//             }
27//         }
28
29//         return -1;
30//     }
31// }