class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx = m;

        // 배열 병합
        for (int i = 0; i < n; i++) {
            nums1[idx++] = nums2[i];
        }
        // 배열 정렬
        Arrays.sort(nums1);
    }
}