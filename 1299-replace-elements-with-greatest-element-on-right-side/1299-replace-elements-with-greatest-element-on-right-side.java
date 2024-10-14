class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr == null || arr.length == 1)
            return new int[]{-1};
        
        for (int i = arr.length - 1; i >= 1; i--) {
            if (arr[i] > arr[i - 1])
                arr[i - 1] = arr[i];

            if (i == 1) {
                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                    if (j == arr.length - 1) {
                        arr[j] = -1;
                    }
                }
            }
        }
        return arr;
    }
}
