class Solution {
    public int[] countBits(int n) {
        int result[] = new int[n + 1];
        // 첫번째 요소 초기화
        result[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            int num = i;
            int cnt = 0;

            // 비트 연산자 활용하여 재귀 순환
            while (num != 0) {
                num &= num - 1;
                cnt++;
            }
            result[i] = cnt;
        }
        
        return result;
    }
}
