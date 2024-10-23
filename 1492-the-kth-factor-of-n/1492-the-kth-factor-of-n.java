class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();

        // 리스트에 요소 저장
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                list.add(i);

        // 약수의 개수가 부족하면 -1 반환
        if (list.size() < k)
            return -1;

        return list.get(k - 1);
    }
}
