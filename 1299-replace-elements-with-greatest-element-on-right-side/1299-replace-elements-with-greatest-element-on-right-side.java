class Solution {
    public int[] replaceElements(int[] arr) {
        // 제약 조건 확인
        if (arr == null || arr.length == 1)
            return new int[]{-1};

        // 배열 요소 값 비교
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] > arr[i - 1])
                arr[i - 1] = arr[i];

            // 배열 요소 1칸씩 왼쪽으로 밀기
            if (i == 1) {
                for (int j = 1; j < arr.length; j++)
                    arr[j - 1] = arr[j];
                // 마지막 요소 값 지정
                arr[arr.length - 1] = -1;
            }
        }
        
        return arr;
    }
}
