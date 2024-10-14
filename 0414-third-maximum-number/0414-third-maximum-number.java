class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        for (int i=0; i < nums.length / 2; ++i) {
            int tmp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = tmp;
        }
        
        int cnt = 1;
        int p = nums[0];
        
        for (int i=1; i < nums.length; ++i) {
            if (nums[i] != p) {
                cnt++;
                p = nums[i];
            }
            
            if (cnt == 3) {
                return nums[i];
            }
        }
        
        return nums[0];
    }
}