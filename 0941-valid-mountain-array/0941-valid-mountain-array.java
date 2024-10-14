class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = 0;
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        
        if (arr.length < 3 || idx == 0 || idx == arr.length - 1) {
            return false;
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(i < idx && arr[i] >= arr[i+1])
                return false;
            else if (arr[i] <= arr[i+1])
                return false;
        }
        return true;
    }
}