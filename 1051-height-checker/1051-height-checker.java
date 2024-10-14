class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int tmp = 0;
        int arr[] = new int[heights.length];
        
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
        
        Arrays.sort(arr);
        
        while (tmp < arr.length) {
            if (arr[tmp] != heights[tmp]) {
                count++;
            }
            tmp++;
        }
        
        return count;
    }
}