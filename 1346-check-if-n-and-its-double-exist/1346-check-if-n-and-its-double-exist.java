class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i <= arr.length-1; i++) {
            int j = 0;
            while (j <= arr.length-1) {
                if (arr[i] * 2 == arr[j] && i != j) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}