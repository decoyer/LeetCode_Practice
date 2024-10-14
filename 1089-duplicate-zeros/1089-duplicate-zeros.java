class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 배열에서 0 나오면 0부터 오른쪽 요소 다시 저장
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
    }
}
