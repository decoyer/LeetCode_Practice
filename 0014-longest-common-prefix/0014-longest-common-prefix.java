class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        // 한 단어씩 비교 후 공통 문자열만 저장
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // 다른 단어 발견 시 저장된 문자열 반환
            for (String str : strs) {
                if (str.length() <= i || c != str.charAt(i))
                    return sb.toString();
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
