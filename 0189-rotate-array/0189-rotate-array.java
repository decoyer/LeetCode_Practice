class Solution {
    public void rotate(int[] nums, int k) {
    	int[] arr = new int[nums.length];
        int length = nums.length;
    	int shift = k % length;
        int tmp = shift;

    	for (int i = 0; i < shift; i++)
    		arr[i] = nums[length - shift + i];
        
    	for (int i = 0; i < length - shift; i++)
    		arr[tmp++] = nums[i];

    	for (int i = 0; i < length; i++)
    		nums[i] = arr[i];
    }
}