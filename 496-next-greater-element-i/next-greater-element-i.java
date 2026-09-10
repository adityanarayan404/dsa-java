class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] ans = new int [nums1.length];

        for(int i = 0 ; i < nums1.length; i++){
           int target = nums1[i];
           ans[i] = -1;

           for(int j = 0; j<nums2.length; j++){
            if(nums2[j] == target){

                // look for next greater element
                for(int k = j+1;k<nums2.length;k++){
                    if(nums2[k]>target){
                        ans[i] = nums2[k];
                        break;

                    }
            
                }
                break;
            }

           }
        }
        return ans;
    }


}