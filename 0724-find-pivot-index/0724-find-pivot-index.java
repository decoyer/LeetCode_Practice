class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;

        for (int num : nums)
            sum += num;
        
        for (int i = 0; i < nums.length; i++) {
            if (left == sum - left - nums[i])
                return i;
            left += nums[i];
        }
        
        return -1;
    }
}