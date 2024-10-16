class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, result = 0;
        
        for (int num : nums) {
            if (num == 1)
                cnt++;
            else
                cnt = 0;
            if (result < cnt)
                result = cnt;
        }
        
        return result;
    }
}