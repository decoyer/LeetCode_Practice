class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = 0;
        int idx = 0;

        // 배열 안의 최대값과 인덱스 저장
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }

        // 제약조건 확인
        if (arr.length < 3 || idx == 0 || idx == arr.length - 1)
            return false;
        
        for (int i = 0; i < arr.length - 1; i++) {
            // 오르막길 확인
            if (i < idx && arr[i] >= arr[i+1])
                return false;
            // 내리막길 확인
            else if (i >= idx && arr[i] <= arr[i+1])
                return false;
        }
        
        return true;
    }
}
