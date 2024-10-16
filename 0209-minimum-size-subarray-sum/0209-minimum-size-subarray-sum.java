class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int idx = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // 타겟 값과 동일한 요소 발견 시 1 반환
            if (nums[i] == target)
                return 1;

            // 배열 순회하면서 요소 합이 타겟 값보다 높을 때 확인
            sum += nums[i];

            // 왼쪽부터 합에서 빼면서 조건을 만족하는 최소 길이 저장
            while (sum >= target) {
                result = Math.min(result, i - idx + 1);
                sum -= nums[idx++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
