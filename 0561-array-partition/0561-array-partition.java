class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;

        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++)
            result += nums[i++];
        
        return result;
    }
}