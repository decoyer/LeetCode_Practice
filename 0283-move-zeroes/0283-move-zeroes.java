class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        // 2개의 포인터로 배열 순회
        for (int i = 0; i < nums.length; i++) {
            // 값이 0인 요소 탐색(1번 포인터)
            if (nums[i] != 0) {
                // 1개의 포인터만 값이 0이고 서로 다른 자리에 있을 때 자리 바꿈
                if (nums[idx] == 0 && i != idx) {
                    int tmp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = tmp;
                }
            }

            // 값이 0인 요소 탐색(2번 포인터)
            if (nums[idx] != 0)
                idx++;
        }
    }
}
