1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int low = 0, high  = 0;
4
5        for(int num : nums){
6            low = Math.max(low, num);
7            high += num;
8        }
9        int ans = high;
10        // for(int maxsum = low; maxsum <= high; maxsum++){
11        //     if(cansplit(nums, k, maxsum)){
12        //         ans = maxsum;
13        //         break;
14        while(low <= high){
15            int mid = low + (high - low)/2;
16
17             if(cansplit(nums, k, mid)){
18                ans = mid;
19                high = mid - 1;
20
21             } else {
22                low = mid + 1;
23             }
24        }
25        return ans;
26            }
27        
28        
29    
30    private boolean cansplit(int[] nums, int k, int maxsum){
31        int count = 1;
32        int currsum = 0;
33
34        for(int num:nums){
35            if(currsum + num <= maxsum){
36                currsum += num;
37
38            }else {
39                count++;
40                currsum = num;
41            }
42        }
43        return count <= k;
44    }
45}