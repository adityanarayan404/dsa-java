1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3
4        int low = 1;
5        int high = 0;
6
7        for(int p : piles) {
8            high = Math.max(high, p);
9        }
10
11        while(low <= high) {
12
13            int k = low + (high - low) / 2;
14            long hours = 0;
15
16            for(int p : piles) {
17                hours += (p + k - 1) / k;
18            }
19
20            if(hours <= h) {
21                high = k - 1;
22            }
23            else {
24                low = k + 1;
25            }
26        }
27
28        return low;
29    }
30}