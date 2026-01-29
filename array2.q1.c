/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findErrorNums(int* nums, int numsSize, int* returnSize) {

    int* arr = malloc(2 * sizeof(int)); 
    *returnSize = 2; 

    int duplicate = -1; 
    int replacement = -1; 

    for (int i = 0; i < numsSize; i ++) {
        int index = abs(nums[i]) - 1;

        if (nums[index] < 0) {
            duplicate = abs(nums[i]); 
        } else {
            nums[index] *= -1; 
        }
    }

      for (int i = 0; i < numsSize; i ++) {
        if (nums[i] > 0) {
            replacement = i +1; 
            break;
        }
    }
    
    arr[0] = duplicate; 
    arr[1] = replacement;

    return arr; 
}
