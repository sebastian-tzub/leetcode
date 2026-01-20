class Solution {
    public int countValidSelections(int[] nums) {
        // find first value of curr where nums[curr] == 0
        int n = nums.length; 
        int curr = 0; 
        int idx = 0; 
        int[] currValues = new int[n];

        while (curr < n) {
            if(nums[curr] == 0){
                currValues[idx] = curr;
                idx ++; 
            } 
            curr++; 
        }
        
        // create direction array
        int[] dir = {-1,1}; 

        // create prefix sum array
        int[] prefixSum = new int[n+1];
        for (int r = 1; r <= n; r++) {
            prefixSum[r] = nums[r-1] + prefixSum[r-1]; 
        }

        // loop through all possible values of starting curr and all possible directions
        int numValidSelections = 0; 
        for (int t = 0; t < idx; t++) {

            int i = currValues[t]; 

            for (int startDir : dir) {

                int d = startDir; 
                curr = i;
                int[] arr = nums.clone();
                
                while (curr >= 0 && curr < n) {
                    if (arr[curr] == 0) {
                        curr = curr + d; 
                    } else {
                        arr[curr] --;
                        d = -d; 
                        curr += d; 
                    }
                }
                boolean valid = true; 
                for (int w : arr) {
                    if (w != 0) {
                        valid = false;
                        break; 
                    }
                }
                if (valid) {
                    numValidSelections++; 
                }
            } 
        }
        return numValidSelections; 
    }
}
