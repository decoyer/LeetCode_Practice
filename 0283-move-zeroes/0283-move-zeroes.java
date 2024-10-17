class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        
        if (length == 0) {
            return;
        }
        
        for (int i = 0; i < length; i++) {
            int index = i+1;
            
            if (nums[i] == 0) {
                while (true) {
                    if (index == length) {
                        return;
                    }
                    
                    if (nums[index] != 0) {
                        break;
                    }
                    index++;
                }
                nums[i] = nums[index];
                nums[index] = 0;
            }
        }
        return;
    }
}