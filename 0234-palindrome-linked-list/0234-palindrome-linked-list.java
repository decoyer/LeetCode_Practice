class Solution {
    public boolean isPalindrome(ListNode head) {
        // 2개의 포인터 생성
        ListNode fast = head;
        ListNode slow = head;

        // 리스트 중간 지점 찾기
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 노드 개수 홀수 처리
        if (fast != null)
            slow = slow.next;

        // 중간 지점부터 노드 반전
        ListNode check = reverseList(slow);
        
        // 중간 지점을 기준으로 체크
        while (check != null) {
            if (head.val != check.val)
                return false;
            head = head.next;
            check = check.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode result = null;

        // 더미 노드 생성 및 노드 위치 교환
        while (head != null) {
            ListNode tmp = head;
            
            head = head.next;
            tmp.next = result;
            result = tmp;
        }

        return result;
    }
}
