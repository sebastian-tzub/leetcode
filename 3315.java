class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size(); 
        int[]ans = new int[n];

        for (int i = 0; i < n; i++){
            int x = nums.get(i);
            int currAns = -1;
            int bitPos = 1; 
            if (x==2){
                ans[i] = -1; 
                continue; 
            }
            while ((x&bitPos) != 0){
                bitPos = bitPos << 1; 
            }
            currAns = x - (bitPos >> 1);
            ans[i] = currAns; 
        }
        return ans; 
    }
}
