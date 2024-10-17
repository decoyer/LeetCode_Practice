class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (nums[idx] == 0 && i != idx) {
                    int tmp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = tmp;
                }
            }

            if (nums[idx] != 0)
                idx++;
        }
    }
}