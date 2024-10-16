class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String words : arr) {
            StringBuilder sb = new StringBuilder(words);
            result.append(sb.reverse() + " ");
        }
        
        return result.toString().trim();
    }
}