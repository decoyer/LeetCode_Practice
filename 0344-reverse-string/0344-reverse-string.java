class Solution {
    public void reverseString(char[] s) {
        // 배열을 절반으로 나누어 앞뒤 요소 자리 바꾸기
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = ' ';
            
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
