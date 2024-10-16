class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] max = new int[nums.length];
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            max[i] = count;
        }
        
        Arrays.sort(max);
        
        return max[max.length-1];
    }
}