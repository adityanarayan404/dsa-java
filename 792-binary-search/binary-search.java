class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int result=-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                result = mid;
                break;
            }
            else if(nums[mid] > target) {
                high = mid - 1;
                
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
}