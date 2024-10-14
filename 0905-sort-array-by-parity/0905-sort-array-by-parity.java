class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        int tmp = 0;
        
        if (length == 0) {
            return nums;
        }

        for (int i = 0; i < length; i++) {
            int index = i+1;
            
            if (nums[i] % 2 != 0) {
                while (true) {
                    if (index == length) {
                        return nums;
                    }
                    if (nums[index] % 2 == 0) {
                        break;
                    }
                    index++;
                }
                tmp = nums[index];
                nums[index] = nums[i];
                nums[i] = tmp;
            }
        }
        
        return nums;
    }
}