class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, result = 0;

        // 배열 요소의 값이 0이면 초기화, 0이 아니면 카운트
        for (int num : nums) {
            if (num == 0)
                cnt = 0;
            else
                cnt++;

            // 최대 카운트(연속) 값을 저장
            result = result < cnt ? cnt : result;
        }
        
        return result;
    }
}
