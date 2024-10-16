class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        // 2칸 이상 공백을 1칸으로 바꾸고, 단어만 배열에 저장
        String[] words = s.replaceAll(" +", " ").split(" ");

        // 배열에 저장된 단어를 역순으로 문자열에 저장
        for (int i = words.length - 1; i >= 0; i--)
            sb.append(words[i] + " ");

        // 저장된 문자열의 앞 뒤 공백 제거 후 반환
        return sb.toString().trim();
    }
}
