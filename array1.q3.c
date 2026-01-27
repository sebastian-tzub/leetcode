int findMaxConsecutiveOnes(int* nums, int numsSize) {

    int counter = 0; 
    int maxCount = 0; 
    for (int i = 0; i < numsSize; i++) {
        if (nums[i] == 1) {
            counter ++; 
        } else {
            if (counter > maxCount){
                maxCount = counter; 
            }
            counter = 0; 
        }
    }
    
    return (counter > maxCount) ? counter : maxCount; 
    
}
