class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;

        // 배열 정렬
        Arrays.sort(nums);

        // [a, b] (a <= b)의 구조에서 a값끼리 더함
        for (int i = 0; i < nums.length; i++)
            result += nums[i++];
        
        return result;
    }
}
