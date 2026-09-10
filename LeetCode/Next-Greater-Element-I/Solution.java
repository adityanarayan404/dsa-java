class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length && nums2[j] != nums1[i]) {
                j++;
            }
            int k = j + 1;
            while (k < nums2.length && nums2[k] <= nums2[j]) {
                k++;
            }
            res[i] = (k < nums2.length) ? nums2[k] : -1;
        }
        return res;
    }
}
