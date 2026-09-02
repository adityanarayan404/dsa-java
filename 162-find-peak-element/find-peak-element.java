class Solution {
    public int findPeakElement(int[] nums) {
        int left =0;
        int right = nums.length-1;

        while(left<right){
            int mid = left+(right-left)/2;

            if(nums[mid] > nums[mid+1]){
                right = mid;

            }
            else{
                left = mid + 1;

            }
        }
        return right;  // or left
    }
}
//         int n = nums.length;

//         for(int i = 1; i < nums.length - 1; i++) {
//             if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }