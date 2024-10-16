class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        
        for (String words : arr) {
            StringBuilder sb = new StringBuilder(words);
            result.append(sb.reverse() + " ");
        }
        
        return result.toString().trim();
    }
}
