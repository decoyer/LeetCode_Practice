class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // 2개의 포인터
        while (left < right) {
            // 배열의 왼쪽에는 짝수 요소
            if (nums[left] % 2 == 0)
                left++;

            // 배열의 오른쪽에는 홀수 요소
            else if (nums[right] % 2 == 1)
                right--;

            // 짝수 요소와 홀수 요소 자리 바꾸기
            else {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
