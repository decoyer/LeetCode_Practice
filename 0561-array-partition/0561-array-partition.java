class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
            i++;
        }
        
        return result;
    }
}