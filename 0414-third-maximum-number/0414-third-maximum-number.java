    class Solution {
        public int thirdMax(int[] nums) {
            Arrays.sort(nums);
            int result = 0;
            int cnt = 1;

            for (int i = nums.length - 1; i >= 1; i--) {
                if (nums[i] != nums[i - 1]) {
                    cnt++;
                    result = nums[i - 1];
                }
                if (cnt == 3)
                    return result;
            }

            return nums[nums.length - 1];
        }
    }