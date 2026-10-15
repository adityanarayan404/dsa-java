// class Solution {
//     public int search(int[] nums, int target) {
//         int low=0;
//         int high = nums.length-1;
//         int result=-1;

//         while(low <= high){
//             int mid = low + (high-low)/2;

//             if(nums[mid] == target){
//                 result = mid;
//                 break;
//             }
//             else if(nums[mid] > target) {
//                 high = mid - 1;
                
//             }
//             else{
//                 low = mid + 1;
//             }
//         }
//         return result;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        int lb =0;
        int ub =nums.length-1;
        return recur(lb, ub, nums, target);
    }
    public int recur(int lb, int ub, int[] nums, int target) {
        if(ub>=lb) {
            int mid = lb+(ub-lb)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                return recur(mid+1, ub, nums, target);
            }
            else{
                return recur(lb, mid-1, nums, target);
            }
        }
        return -1;
    }
}

