/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){

    int* returnArray = (int*)malloc(2 * n * sizeof(int));

    *returnSize = 2 * n; 

    for (int i = 0; i<2*n; i++){
        if (i%2 == 0) {
            returnArray[i] = nums[i/2];
        } else {
            returnArray[i] = nums[n + i/2]; 
        }
    }

    return returnArray;

}
