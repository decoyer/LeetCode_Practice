class Solution {
    public void rotate(int[] nums, int k) {
    	int[] tmp = new int[nums.length];
    	int shift = k % nums.length;
        int count = shift;

    	for(int i = 0; i < shift; i++) {
    		tmp[i] = nums[tmp.length-shift+i];
    	}
        
    	for(int i = 0; i < nums.length-shift; i++) {
    		tmp[count++] = nums[i];
    	}

    	for(int i=0; i < nums.length; i++) {
    		nums[i] = tmp[i];
    	}
    }
}