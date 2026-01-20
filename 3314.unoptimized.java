class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {

        int n = nums.size(); 
        int[]ans = new int[n];
        for (int i = 0; i < n; i++) {
            int currNum = nums.get(i);
            int ansNum = -1; 
            for (int j = 1; j < currNum; j++){
                if((j | (j+1)) == currNum){
                    ansNum = j; 
                    break; 
                }
            }
            ans[i] = ansNum; 
        }
        return ans; 
    }
}
