class Solution {
    public int heightChecker(int[] heights) {
        int cnt = 0;
        // 비교를 위한 배열 생성
        int arr[] = heights.clone();

        // 배열 정렬
        Arrays.sort(arr);

        // 배열 비교
        for (int i = 0; i < heights.length; i++) {
            if (arr[i] != heights[i])
                cnt++;
        }
        
        return cnt;
    }
}
