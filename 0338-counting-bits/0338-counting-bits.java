class Solution {
    public int[] countBits(int n) {
        int result[] = new int[n + 1];
        result[0] = 0;
        
        for (int i = 1; i <= n; i++) {

            int num = i;
            int cnt = 0;
            while (num != 0) {
                num &= num - 1;
                cnt++;
            }
            result[i] = cnt;
        }
        
        return result;
    }
}