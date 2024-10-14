class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int idx = 0;

        // 배열 안의 최대값과 인덱스 저장
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                idx = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            // 최대값 인덱스는 스킵
            if (i == idx)
                continue;
            // 최대값이 배열 요소의 2배보다 작으면 -1 반환
            if (max < nums[i] * 2)
                return -1;
        }
        
        return idx;
    }
}
