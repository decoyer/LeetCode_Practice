class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;

        // nums 배열 요소들의 합
        for (int num : nums)
            sum += num;

        // i를 기준으로 왼쪽 요소들의 합을 구하여 전체 합에서 뺀 값과 비교 (왼쪽 합 == 오른쪽 합)
        for (int i = 0; i < nums.length; i++) {
            if (left == sum - left - nums[i])
                return i;
            left += nums[i];
        }
        
        return -1;
    }
}
