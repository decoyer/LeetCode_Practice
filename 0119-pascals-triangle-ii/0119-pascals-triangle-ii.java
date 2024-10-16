class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        double num = 1;
        
        for (int i = 0; i <= rowIndex; i++) {
            list.add((int)num);
            num = num * (rowIndex - i) / (i + 1);
        }

        return list;
    }
}