class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0, result = 0;
        
        for (int num : nums) {
            if (num == 0)
                cnt = 0;
            else
                cnt++;
            
            result = (result < cnt) ? cnt : result;
        }
        
        return result;
    }
}