class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int idx = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // 타겟 값과 동일한 요소 발견 시 1 반환
            if (nums[i] == target)
                return 1;

            
            sum += nums[i];

            while (sum >= target) {
                result = Math.min(result, i - idx + 1);
                sum -= nums[idx++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
