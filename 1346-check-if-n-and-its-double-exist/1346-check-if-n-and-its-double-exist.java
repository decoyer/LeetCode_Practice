class Solution {
    public boolean checkIfExist(int[] arr) {
        // 배열 순회
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = 0;
            // 서로 다른 2개의 요소 중 조건에 맞는 경우 확인
            while (j <= arr.length - 1) {
                if (arr[i] * 2 == arr[j] && i != j)
                    return true;
                j++;
            }
        }
        return false;
    }
}
