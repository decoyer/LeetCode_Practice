class Solution {
    public int[] sortedSquares(int[] nums) {
        // 각 요소 제곱 후 저장
        for (int i = 0; i < nums.length; i++)
            nums[i] *= nums[i];

        // 배열 정렬
        Arrays.sort(nums);

        return nums;
    }
}
