class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long num = 1;

        // 이항정리 공식을 활용하여 계산 후 값 저장
        for (int i = 0; i < rowIndex; i++) {
            list.add((int)num);
            num = num * (rowIndex - i) / (i + 1);
        }

        // 삼각형의 마지막 항은 1로 저장
        list.add(1);

        return list;
    }
}
