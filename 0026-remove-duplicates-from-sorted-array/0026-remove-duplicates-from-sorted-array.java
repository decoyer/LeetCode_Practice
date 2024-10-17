class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;

        // 배열 순회 및 요소 비교하여 중복되지 않은 값만 저장
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] != nums[i + 1])
                nums[index++] = nums[i + 1];

        return index;
    }
}
