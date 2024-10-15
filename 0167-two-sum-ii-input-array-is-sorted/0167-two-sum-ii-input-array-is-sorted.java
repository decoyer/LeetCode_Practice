class Solution {  
    public int[] twoSum(int[] numbers, int target) {  
        int left = 0;
        int right = numbers.length-1;

        // 오름차순으로 배열되어 있으므로 2개의 요소 합과 타겟 값이 같을 때까지 순회
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            // 값이 같으면 반복문 종료
            if (sum == target)
                break;

            // 합이 작으면 오른쪽으로 포인터 이동
            else if (sum < target)
                left++;

            // 합이 크면 왼쪽으로 포인터 이동
            else
                right--;
        }

        // 배열 요소의 위치 반환
        return new int[]{left+1, right+1};
    }  
}
