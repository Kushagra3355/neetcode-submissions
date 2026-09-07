class Solution {
    public int missingNumber(int[] nums) {
        int actual_xor =0;
        for(int i = 0 ; i < nums.length ; i++){
            actual_xor = actual_xor ^ nums[i];
        }
        int expected_xor = 0;
        for(int i = 0; i<=nums.length; i++){
            expected_xor = expected_xor ^ i;
        }
        return actual_xor ^ expected_xor;
    }
}
