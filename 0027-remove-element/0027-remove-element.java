class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;

        // val 값과 다를 때 카운트 및 저장
        for (int num : nums) {
            if (num != val)
                nums[index++] = num;
        }
        
        return index;
    }
}
