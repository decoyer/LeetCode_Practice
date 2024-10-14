class Solution {
    public void reverseString(char[] s) {
        // 배열의 가운데 요소를 기준으로 앞뒤 요소 자리 바꾸기
        for (int i = 0; i < s.length / 2; i++) {
            char tmp = ' ';
            
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
