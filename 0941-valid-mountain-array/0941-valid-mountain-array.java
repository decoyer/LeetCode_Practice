class Solution {
    public boolean validMountainArray(int[] arr) {
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        
        if(arr.length < 3 || index == 0 || index == arr.length - 1) {
            return false;
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(i < index) {
                if(arr[i] >= arr[i+1]) return false;
            }
            else {
                if(arr[i] <= arr[i+1]) return false;
            }
        }
        return true;
    }
}