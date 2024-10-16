class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        // 공백을 제외한 단어만 배열에 저장
        String[] arr = s.split(" ");

        // 배열에 저장된 단어 조합을 역순으로 문자열에 저장
        for (String words : arr) {
            StringBuilder sb = new StringBuilder(words);
            result.append(sb.reverse() + " ");
        }

        // 저장된 문자열의 앞 뒤 공백 제거 후 반환
        return result.toString().trim();
    }
}
