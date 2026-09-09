class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high  = 0;

        for(int num : nums){
            low = Math.max(low, num);
            high += num;
        }
        int ans = high;
        // for(int maxsum = low; maxsum <= high; maxsum++){
        //     if(cansplit(nums, k, maxsum)){
        //         ans = maxsum;
        //         break;
        while(low <= high){
            int mid = low + (high - low)/2;

             if(cansplit(nums, k, mid)){
                ans = mid;
                high = mid - 1;

             } else {
                low = mid + 1;
             }
        }
        return ans;
            }
        
        
    
    private boolean cansplit(int[] nums, int k, int maxsum){
        int count = 1;
        int currsum = 0;

        for(int num:nums){
            if(currsum + num <= maxsum){
                currsum += num;

            }else {
                count++;
                currsum = num;
            }
        }
        return count <= k;
    }
}