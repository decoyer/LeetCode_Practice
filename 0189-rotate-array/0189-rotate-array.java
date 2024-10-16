class Solution {
    public void rotate(int[] nums, int k) {
    	int[] arr = new int[nums.length];
        int length = nums.length;
    	int shift = k % length;    // k 값이 배열 길이보다 클 때 방지
        int tmp = shift;

        // 배열을 절반으로 나누어 임시 배열에 저장
    	for (int i = 0; i < shift; i++)
    		arr[i] = nums[length - shift + i];
        
    	for (int i = 0; i < length - shift; i++)
    		arr[tmp++] = nums[i];

        // 임시 배열에 저장된 요소로 배열 초기화
    	for (int i = 0; i < length; i++)
    		nums[i] = arr[i];
    }
}
