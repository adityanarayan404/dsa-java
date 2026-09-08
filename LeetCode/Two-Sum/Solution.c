1int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
2    for(int i = 0; i < numsSize; i++) {
3        for(int j = i + 1; j < numsSize; j++) {
4            if(nums[i] + nums[j] == target) {
5                int* result = (int*)malloc(2 * sizeof(int));
6                result[0] = i;
7                result[1] = j;
8                *returnSize = 2;
9                return result;
10            }
11        }
12    }
13    *returnSize = 0;
14    return NULL;
15}