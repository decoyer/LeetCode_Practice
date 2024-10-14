class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;

        for (int num : nums)
            sum += num;
        
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            if (left == sum - left)
                return i;
        }
        
        return -1;
    }
}