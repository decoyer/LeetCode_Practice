    class Solution {
        public int thirdMax(int[] nums) {
            // 배열 정렬
            Arrays.sort(nums);
            int result = 0;
            int cnt = 1;

            // 배열 역방향 순회
            for (int i = nums.length - 1; i >= 1; i--) {
                // 서로 다른 값일 때만 카운트
                if (nums[i] != nums[i - 1]) {
                    cnt++;
                    result = nums[i - 1];
                }
                // 3번째로 큰 요소 반환
                if (cnt == 3)
                    return result;
            }

            // 3번째로 큰 요소가 없을 시 최대값 요소 반환
            return nums[nums.length - 1];
        }
    }
