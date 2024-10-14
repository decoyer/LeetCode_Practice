import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int a = 0;
        int tmp = 0;
        
        while (a < nums.length) {
            int num = nums[a];
            
            num *= num;
            nums[a] = num;
            
            a++;
        }
        
        Arrays.sort(nums);
        
        return nums;
    }
}