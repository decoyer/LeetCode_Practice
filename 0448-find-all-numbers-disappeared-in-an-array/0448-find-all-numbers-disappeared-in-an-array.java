class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length + 1];
        List<Integer> list = new ArrayList<>();

        // 배열 생성 후 각 자리에 요소 저장
        for (int num : nums)
            arr[num] = 1;

        // 비어있는 요소 확인 후 반환
        for (int i = 1; i < nums.length + 1; i++) {
            if (arr[i] == 0)
                list.add(i);
        }
        
        return list;
    }
}
